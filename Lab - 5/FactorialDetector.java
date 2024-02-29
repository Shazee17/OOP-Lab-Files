import java.util.*;

public class FactorialDetector {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any input: ");
        int num = sc.nextInt();

        int i = 1;
        boolean found = false;
        while (factorial(i) <= num) {
            if (factorial(i) == num) {
                System.out.println(num + " is the factorial of " + i);
                found = true;
                break;
            }
            i++;
        }

        if (!found) {
            System.out.println(num + " has no factorials!");
        }

        sc.close();
    }
}
