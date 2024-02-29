import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = input.nextLine();

        str = str.toLowerCase();

        char[] charArray = str.toCharArray();


        for (int i = 0, j = charArray.length - 1; i < j; i++, j--){
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            
        }

        String reversedString = new String(charArray);

        input.close();

        if(str.equals(reversedString)){
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is NOT Palindrome");
        }
    }
}
