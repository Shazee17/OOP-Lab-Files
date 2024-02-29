import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: $");
        double income = scanner.nextDouble();

        double taxOwed = 0;

        if (income <= 10000) {
            taxOwed = income * 0.10;
        } else {
            taxOwed += 10000 * 0.10;

            if (income <= 20000) {
                taxOwed += (income - 10000) * 0.15;
            } else {
                taxOwed += 10000 * 0.15 + (income - 20000) * 0.20;
            }
        }


        System.out.println("Tax owed: $" + taxOwed);

        scanner.close();
    }

}
