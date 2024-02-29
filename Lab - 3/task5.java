import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println(num + " is a power of two");
        } else {
            System.out.println(num + " is not a power of two");
        }

        sc.close();
    }
}
