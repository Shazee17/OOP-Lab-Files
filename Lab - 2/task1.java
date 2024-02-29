import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = input.nextLine();

        char[] charArray = str.toCharArray();


        for (int i = 0, j = charArray.length - 1; i < j; i++, j--){
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            
        }

        String reversedString = new String(charArray);

        input.close();


        System.out.println("");
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedString);
    }
}