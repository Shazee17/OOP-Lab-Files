import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StudentDatabase {
    static Student[] students = {
            new Student(1, "Shahzaman", 21),
            new Student(2, "Deepika", 21),
            new Student(3, "Yawar", 21),
            new Student(4, "Simran", 20)
    };

    static Student searchStudentById(int ID) {
        for (Student student : students) {
            if (student.getId() == ID) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the student to search:");
        int searchId = scanner.nextInt();

        Student foundStudent = searchStudentById(searchId);

        if (foundStudent != null) {
            System.out.println("Student found!");
            System.out.println("ID: " + foundStudent.getId());
            System.out.println("Name: " + foundStudent.getName());
            System.out.println("Age: " + foundStudent.getAge());
        } else {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}

