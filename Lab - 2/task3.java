import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = input.nextLine();

        char[] array = new char[str.length()];
        array[0] = str.charAt(0);

        int j = 1;

        for (int i = 1; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp != str.charAt(i - 1)) {
                array[j] = temp;
                j++;
            }
        }

        String result = new String(array, 0, j);

        System.out.println("String after removing duplicates: " + result);

        input.close();
    }
}
