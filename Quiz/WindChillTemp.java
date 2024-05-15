import java.util.*;

public class WindChillTemp {

    static public double calculateWindChill(double temperature, double windSpeed){
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of temperature: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter the value of wind speed: ");
        double windSpeed = sc.nextDouble();

        if (windSpeed > 2.0 && temperature > -58.0 && temperature < 41.0 ) {
            System.out.println("Wind Chill Temperature: " + calculateWindChill(temperature, windSpeed));
        } else {
            System.out.println("Error: Temperature or wind speed input is not within acceptable range.");
        }


        sc.close();
    }
}
