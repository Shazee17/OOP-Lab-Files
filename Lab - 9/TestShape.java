import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceTo(Point p) {
        return Math.sqrt((x - p.getX()) * (x - p.getX()) + (y - p.getY()) * (y - p.getY()));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Shape {
    protected Point center;

    public Shape(Point center) {
        this.center = center;
    }

    public boolean isInside(Point p) {
        return false; 
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle: Center " + center.toString() + ", Radius " + radius;
    }

    @Override
    public boolean isInside(Point p) {
        return center.distanceTo(p) <= radius;
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(Point center, int length, int width) {
        super(center);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle: Center " + center.toString() + ", Length " + length + ", Width " + width;
    }
}

class ShapesArray {
    private Shape[] shapes;
    private int circleCounter;

    public ShapesArray(int size) {
        shapes = new Shape[size];
        circleCounter = 0;
    }

    public void addShape(Shape shape) {
        if (shape instanceof Circle) {
            circleCounter++;
        }
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                shapes[i] = shape;
                return;
            }
        }
        System.out.println("Shapes array is full, cannot add more shapes.");
    }

    public void displayRectsInfo() {
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println(shape.toString());
            }
        }
    }

    public int getCircleCounter() {
        return circleCounter;
    }

    public double getAvgAreas() {
        double totalArea = 0;
        int count = 0;
        for (Shape shape : shapes) {
            if (shape != null) {
                if (shape instanceof Circle) {
                    totalArea += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
                    count++;
                } else if (shape instanceof Rectangle) {
                    totalArea += ((Rectangle) shape).getLength() * ((Rectangle) shape).getWidth();
                    count++;
                }
            }
        }
        if (count == 0) {
            return 0;
        }
        return totalArea / count;
    }

    public void removeAllRect() {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle) {
                shapes[i] = null;
            }
        }
    }
}

public class TestShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapesArray shapesArray = new ShapesArray(20);

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add new shape");
            System.out.println("   a. Add rectangle");
            System.out.println("   b. Add circle");
            System.out.println("2. Display all rectangles");
            System.out.println("3. Display the average shape area");
            System.out.println("4. Display the number of circles");
            System.out.println("5. Remove all rectangles");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter shape type (a for rectangle, b for circle): ");
                    char shapeType = scanner.next().charAt(0);
                    if (shapeType == 'a') {
                        System.out.println("Enter center coordinates (x y): ");
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        Point center = new Point(x, y);
                        System.out.println("Enter length and width: ");
                        int length = scanner.nextInt();
                        int width = scanner.nextInt();
                        shapesArray.addShape(new Rectangle(center, length, width));
                    } else if (shapeType == 'b') {
                        System.out.println("Enter center coordinates (x y): ");
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        Point center = new Point(x, y);
                        System.out.println("Enter radius: ");
                        int radius = scanner.nextInt();
                        shapesArray.addShape(new Circle(center, radius));
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;
                case 2:
                    System.out.println("Displaying all rectangles:");
                    shapesArray.displayRectsInfo();
                    break;
                case 3:
                    System.out.println("Average shape area: " + shapesArray.getAvgAreas());
                    break;
                case 4:
                    System.out.println("Number of circles: " + shapesArray.getCircleCounter());
                    break;
                case 5:
                    shapesArray.removeAllRect();
                    System.out.println("All rectangles removed.");
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
