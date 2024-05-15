//Lab 11 - Question 6


abstract class Shape {
    protected int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    abstract double getArea();

    abstract double getPerimeter();
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        super(4); 
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }
}

class RtTriangle extends Shape {
    private double width, height;

    public RtTriangle(double width, double height) {
        super(3); 
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * width * height;
    }

    @Override
    double getPerimeter() {
        double hypotenuse = Math.sqrt(width * width + height * height);
        return width + height + hypotenuse;
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle:");
        System.out.println("Number of sides: " + rectangle.getNumSides());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println();


        RtTriangle triangle = new RtTriangle(3, 4);
        System.out.println("Right Triangle:");
        System.out.println("Number of sides: " + triangle.getNumSides());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
