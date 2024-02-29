import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        boolean anagrams;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();


        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();


        if (str1.length() != str2.length()) {
            anagrams = false;

        } else {

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            anagrams = Arrays.equals(charArray1, charArray2);
        }

        if (anagrams) {
            System.out.println("Yes, the strings are anagrams.");
        } else {
            System.out.println("No, the strings are not anagrams.");
        }

        scanner.close();
    }
}
