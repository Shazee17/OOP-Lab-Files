//Lab 12 - Question 2

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2;
        double r;

        while (true) {
            try {
                System.out.print("Enter the first integer: ");
                n1 = scan.nextInt();

                System.out.print("Enter the second integer: ");
                n2 = scan.nextInt();

                r = (double) n1 / n2;
                System.out.println("Result of division: " + r);

                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter integer values only.");
                scan.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }


        scan.close();
    }
}
