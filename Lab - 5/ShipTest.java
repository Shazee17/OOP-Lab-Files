import java.util.*;

public class ShipTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of bags in the order: ");
        int numBags = sc.nextInt();

    
        Ship ship = new Ship(numBags);

        ship.displayDetails();

        sc.close();
    }
}

class Ship {
    int numBags;
    double totalBagCost;
    int largeBoxes;
    int mediumBoxes;
    int smallBoxes;
    double overallTotalCost;

    // Constants
    double bagPrice = 5.50;
    int largeBoxCapacity = 20;
    double largeBoxCost = 1.80;
    int mediumBoxCapacity = 10;
    double mediumBoxCost = 1.00;
    int smallBoxCapacity = 5;
    double smallBoxCost = 0.60;

    public Ship(int numBags) {
        this.numBags = numBags;
        calculateCosts();
    }

    private void calculateCosts() {
        // Calculate the number of boxes needed
        largeBoxes = numBags / largeBoxCapacity;
        mediumBoxes = (numBags % largeBoxCapacity) / mediumBoxCapacity;
        smallBoxes = ((numBags % largeBoxCapacity) % mediumBoxCapacity) / smallBoxCapacity;

        // Calculate the total cost of bags
        totalBagCost = numBags * bagPrice;

        // Calculate the total cost of boxes
        double totalBoxCost = largeBoxes * largeBoxCost + mediumBoxes * mediumBoxCost + smallBoxes * smallBoxCost;

        // Calculate the overall total cost
        overallTotalCost = totalBagCost + totalBoxCost;
    }

    public void displayDetails() {
        System.out.println("Number of Bags Ordered: " + numBags);
        System.out.println("The Cost of Order: $" + totalBagCost);
        System.out.println("\nBoxes Used:");
        System.out.println(largeBoxes + " Large - $" + (largeBoxes * largeBoxCost));
        System.out.println(mediumBoxes + " Medium - $" + (mediumBoxes * mediumBoxCost));
        System.out.println(smallBoxes + " Small - $" + (smallBoxes * smallBoxCost));
        System.out.println("\nYour total cost is: $" + overallTotalCost);
    }
}
