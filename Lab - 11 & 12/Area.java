//Lab 11 - Question 5
abstract class Shape{
    abstract void rectangleArea(int length, int breadth);
    abstract void squareArea(int side);
    abstract void circleArea(int radius);
}

public class Area extends Shape{
    void rectangleArea(int length, int breadth){
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    void squareArea(int side){
        System.out.println("Area of square: " + (side * side));
    }

    void circleArea(int radius){
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }


    public static void main(String[] args) {
        Area obj = new Area();

        obj.rectangleArea(5, 10);
        obj.squareArea(5);
        obj.circleArea(5);
    }
}
