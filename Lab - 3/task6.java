import java.util.*;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int num = sc.nextInt();

        if ( (1 & num) == 0) {
            System.out.println("It's an Even number");
        } else {
            System.out.println("It's an Odd number");
        }

        sc.close();
    }
}
