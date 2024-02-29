import java.util.Random;

public class PasswordGenerator {
     String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
     String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String NUMBERS = "0123456789";
     String SYMBOLS = "!@#$%^&*()-_=+[{]}|;:,<.>?";

    public String generatePassword(int length) {
        StringBuilder password = new StringBuilder();

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            String charSet = getRandomCharSet(random);
            password.append(charSet.charAt(random.nextInt(charSet.length())));
        }

        return password.toString();
    }

    private String getRandomCharSet(Random random) {
        int choice = random.nextInt(4);
        switch (choice) {
            case 0:
                return LOWERCASE_LETTERS;
            case 1:
                return UPPERCASE_LETTERS;
            case 2:
                return NUMBERS;
            default:
                return SYMBOLS;
        }
    }

    public static void main(String[] args) {
        PasswordGenerator generator = new PasswordGenerator();
        int length = 12; // Specify the length of the password
        String password = generator.generatePassword(length);
        System.out.println("Generated Password: " + password);
    }
}
