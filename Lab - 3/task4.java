import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = scanner.nextInt();
        int setBits = 0;

        int binary[] = new int[40];

        //Convert to binary first
        int i=0;
        while (num>0) {
            binary[i] = num%2;
            num = num/2;
            i++;
        }

        //calculate set bits
        for (int j = 0; j < i; j++) {
            if (binary[j] != 0) {
                setBits++;
            }
        }

        System.out.println("No. of set bits: " + setBits);

        scanner.close();
    }
}
