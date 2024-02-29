import java.util.*;
import javax.swing.JOptionPane;

public class Rectangle {
    double height;
    double width;

    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    double calculateArea(){
        return height * width;
    }

    double calculatePerimeter(){
        return ( height + width ) * 2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Using Scanner
        System.out.print("Enter the value of Height: ");
        double height = sc.nextDouble();
        System.out.print("Enter the value of Width: ");
        double width = sc.nextDouble();

        Rectangle rectangle = new Rectangle(height, width);

        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        sc.close();


        //Using JOptionPane
        String inputHeight = JOptionPane.showInputDialog("Enter the value of Height");
        double heightValue = Double.parseDouble(inputHeight);

        String inputWidth = JOptionPane.showInputDialog("Enter the value of Width: ");
        double widthValue = Double.parseDouble(inputWidth);

        Rectangle rectJOptionPane = new Rectangle(heightValue, widthValue);
        JOptionPane.showMessageDialog(null, "Area: " + rectJOptionPane.calculateArea() + "\nPerimeter: " + rectJOptionPane.calculatePerimeter());
        
    }
}
