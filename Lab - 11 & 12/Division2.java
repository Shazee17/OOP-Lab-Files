//Lab 12 - Question 3

import java.util.InputMismatchException;
import java.util.Scanner;

// Custom exception class for division by zero
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Division2 {

    public static double returnRatio() throws InputMismatchException, DivisionByZeroException {
        Scanner scan = new Scanner(System.in);

        int n1, n2;
        double result;

        try {
            System.out.print("Enter the first integer: ");
            n1 = scan.nextInt();

            System.out.print("Enter the second integer: ");
            n2 = scan.nextInt();

            if (n2 == 0) {
                throw new DivisionByZeroException("Error: Division by zero is not allowed.");
            }

            result = (double) n1 / n2;
            return result;
        } finally {
            scan.close();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                double ratio = returnRatio();
                System.out.println("Result of division: " + ratio);
                break; // Exit the loop if no exceptions occur
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter integer values only.");
                scan.nextLine();
            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }
        }

        scan.close();
    }
}
