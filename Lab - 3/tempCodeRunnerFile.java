import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students, assignments;

        System.out.print("Enter no. of students: ");
        students = sc.nextInt();
        System.out.print("Enter no. of assignments: ");
        assignments = sc.nextInt();

        int[][] grades = new int[students][assignments];

        System.out.println();

        for (int i = 0; i < students; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ":");
            for (int j = 0; j < assignments; j++) {
                System.out.print("Assignment " + (j + 1) + " : ");
                grades[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Students needing extra help: ");
        // Calculating average
        for (int i = 0; i < students; i++) {
            double total = 0;

            for (int j = 0; j < assignments; j++) {
                total += grades[i][j];
            }

            double average = total / assignments;

            if (average < 50) {
                System.out.println("* Student " + (i + 1) + " Average grade : " + average);
            }
        }

        sc.close();
    }
}
