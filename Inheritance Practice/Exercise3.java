//3. Write a Java program to create a class called Shape with a method called getArea().
// Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape{
    public double getArea(){
        return 0.0;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return length * width;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}
