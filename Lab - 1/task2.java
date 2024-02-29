import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        double heightInCM = height * 100;

        System.out.print("Enter your favorite color: ");
        String color = sc.next();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height (in Meters): " + height + "m");
        System.out.println("Height (in Centimeters): " + heightInCM + "cm");
        System.out.println("Favorite color:" + color);

        sc.close();
    }
}