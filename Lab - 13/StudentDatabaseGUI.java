import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentDatabaseGUI extends JFrame implements ActionListener {

    private JTextField idField, nameField, phoneField, semesterField, cgpaField;
    private JButton addButton, updateButton, deleteButton, retrieveButton;
    private Connection conn;

    public StudentDatabaseGUI() {
        super("Student Database");

        // Establishing database connection
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:student.db");
            createTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Setting up GUI components
        idField = new JTextField(10);
        nameField = new JTextField(20);
        phoneField = new JTextField(15);
        semesterField = new JTextField(5);
        cgpaField = new JTextField(5);

        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        retrieveButton = new JButton("Retrieve");

        addButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
        retrieveButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(new JLabel("ID:"));
        panel.add(idField);
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Phone:"));
        panel.add(phoneField);
        panel.add(new JLabel("Semester:"));
        panel.add(semesterField);
        panel.add(new JLabel("CGPA:"));
        panel.add(cgpaField);
        panel.add(addButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        panel.add(retrieveButton);

        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Student (" +
                     "id INTEGER PRIMARY KEY," +
                     "name TEXT," +
                     "phone TEXT," +
                     "semester INTEGER," +
                     "cgpa REAL)";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
    }

    private void addStudent() throws SQLException {
        String sql = "INSERT INTO Student (name, phone, semester, cgpa) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, nameField.getText());
        pstmt.setString(2, phoneField.getText());
        pstmt.setInt(3, Integer.parseInt(semesterField.getText()));
        pstmt.setDouble(4, Double.parseDouble(cgpaField.getText()));
        pstmt.executeUpdate();
        pstmt.close();
    }

    private void updateStudent() throws SQLException {
        String sql = "UPDATE Student SET name=?, phone=?, semester=?, cgpa=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, nameField.getText());
        pstmt.setString(2, phoneField.getText());
        pstmt.setInt(3, Integer.parseInt(semesterField.getText()));
        pstmt.setDouble(4, Double.parseDouble(cgpaField.getText()));
        pstmt.setInt(5, Integer.parseInt(idField.getText()));
        pstmt.executeUpdate();
        pstmt.close();
    }

    private void deleteStudent() throws SQLException {
        String sql = "DELETE FROM Student WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, Integer.parseInt(idField.getText()));
        pstmt.executeUpdate();
        pstmt.close();
    }

    private void retrieveStudent() throws SQLException {
        int id = Integer.parseInt(idField.getText());
        String sql = "SELECT * FROM Student WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            nameField.setText(rs.getString("name"));
            phoneField.setText(rs.getString("phone"));
            semesterField.setText(String.valueOf(rs.getInt("semester")));
            cgpaField.setText(String.valueOf(rs.getDouble("cgpa")));
        } else {
            JOptionPane.showMessageDialog(this, "No student found with ID: " + id);
        }

        rs.close();
        pstmt.close();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == addButton) {
                addStudent();
            } else if (e.getSource() == updateButton) {
                updateStudent();
            } else if (e.getSource() == deleteButton) {
                deleteStudent();
            } else if (e.getSource() == retrieveButton) {
                retrieveStudent();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentDatabaseGUI::new);
    }
}
