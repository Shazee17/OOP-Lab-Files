import java.util.Scanner;

class Student {
    static String universityName; // Common attribute for all students
    String name; // Non-static attribute specific to each student
    int id; // Non-static attribute specific to each student
}

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student.universityName = "Sukkur IBA University"; // Accessing static variable directly

        // Creating an array of Student objects
        Student[] students = new Student[3];

        // Setting object variables using Scanner
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(); // Instantiating Student object

            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Name: ");
            students[i].name = sc.next(); // Taking input for name
            System.out.print("ID: ");
            students[i].id = sc.nextInt(); // Taking input for ID
        }

        // Output
        System.out.println("\nDetails of all students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": Name - " + students[i].name + ", ID - " + students[i].id + ", University - " + Student.universityName);
        }

        sc.close();
    }
}
