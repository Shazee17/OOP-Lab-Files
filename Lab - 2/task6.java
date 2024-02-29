import java.util.*;

public class task6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any email: ");
        String email = input.nextLine();

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        if (email.matches(emailRegex)) {
            System.out.println("The email address is valid.");
        } else {
            System.out.println("The email address is not valid.");
        }

        input.close();
    }
}
