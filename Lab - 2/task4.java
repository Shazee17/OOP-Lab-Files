import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        char mostFreq = ' ';
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                mostFreq = str.charAt(i);
            }
        }

        System.out.println("Most Frequent character: " + mostFreq);

        scanner.close();
    }
}
