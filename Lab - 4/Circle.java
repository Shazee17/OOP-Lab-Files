public class Circle { 
    double radius;
     // Constructor, Specialized Methods
      Circle(double radius) { 
        this.radius = radius;
     } // Method to calculate the area of the circle 
     double calculateArea() { 
        return Math.PI * radius * radius;
     }
      // Method to calculate the circumference of the circle 
      double calculateCircumference() { 
        return 2 * Math.PI * radius; 
    }
      
    public static void main(String[] args) { 
        // Example usage 
        double radius = 5.0; 
        Circle circle = new Circle(radius); 
        
        // Calculate and print area 
        double area = circle.calculateArea(); 
        System.out.printf("Area of the circle with radius %.2f: %.2f \n", radius, area);
         // Calculate and print circumference 
         double circumference = circle.calculateCircumference();
        System.out.printf("Circumference with radius %.2f: %.2f", radius, circumference);
    }

}