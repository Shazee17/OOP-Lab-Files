import java.util.*;

public class LastDigit {
    static int findLastDigit(int num){
        return (num % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Last Digit: " + LastDigit.findLastDigit(num));

        sc.close();
    }
}
