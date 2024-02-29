import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        // Minimum 8 characters long
        if (password.length() < 8) {
            return false;
        }

        // Contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Contains at least one alphabet
        if (!password.matches(".*[a-zA-Z].*")) {
            return false;
        }

        // Contains at least one special character
        Pattern specialCharPattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = specialCharPattern.matcher(password);
        if (!matcher.find()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        if (isValidPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        
        scanner.close();
    }
}
