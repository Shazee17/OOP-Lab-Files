import java.util.*;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int xor = num1 ^ num2;
        int distance = 0;
        while (xor != 0) {
            distance = distance + (xor & 1); 
            xor >>>= 1;
        }

        System.out.println("Hamming distance between " + num1 + " & " + num2 + " : " + distance);

        sc.close();
    }
}
