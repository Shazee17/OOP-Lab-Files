class Car {
    String brandName;
    double priceNew;
    String color;
    double odometer;

    public Car(String brandName, double priceNew, String color, double odometer){
        this.brandName = brandName;
        this.priceNew = priceNew;
        this.color = color;
        this.odometer = odometer;
    }

    double getPriceAfterUse() {
        return this.priceNew * (1 - this.odometer / 60000);
    }

    double updateMileage(double traveledDistance){
        return this.odometer += traveledDistance;
    }

    void outputDetails(){
        System.out.println("Car Details:");
        System.out.println("Brand Name: " + this.brandName);
        System.out.println("Price New: " + this.priceNew);
        System.out.println("Price Used: " + getPriceAfterUse());
        System.out.println("Color:" + this.color);
        System.out.println("Odometer: " + this.odometer + " miles");
    }

}


public class testCar {
    public static void main(String[] args) {
        //a. Create an object of type Car.
        //b. Assign any valid values to the instance variables of the object created in ‘A’.
        Car car = new Car("Ford", 20000.0, "Black", 18000.0);


        //c. Use the method getPriceAfterUse on the object created in ‘A’ then output the result to the screen.
        System.out.print("Price After Use: " + car.getPriceAfterUse());

        //d. Use the method updateMilage on the object created in ‘A’ by passing a valid value.
        car.updateMileage(4000);
        System.out.println("");

        //e. Do part ‘C’ again.
        System.out.print("Price After Use: " + car.getPriceAfterUse());

        //f. Use the method outputDetails on the object created in ‘A’.
        System.out.println("");
        car.outputDetails();
    }
}
