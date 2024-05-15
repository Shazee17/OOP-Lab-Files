import java.util.Scanner;

class Product{
    String name;
    double price;
    boolean availability;

    Product(String name, double price, boolean availability){
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + availability);
    }
}

public class ShoppingCart {
    static Product products[] = new Product[6];

    public static Product searchByName(String name){
        for (Product product : products) {
            if (product != null && product.name.equalsIgnoreCase(name)) {
                return product;
            }

        }
        return null;
    }

    public static void main(String[] args) {

        products[0] = new Product("Laptop", 999.99, true);
        products[1] = new Product("Smartphone", 599.99, true);
        products[2] = new Product("Headphones", 99.99, false);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a product name to search: ");
        String name = sc.nextLine();

        Product foundProduct = searchByName(name);

        if (foundProduct != null) {
            System.out.println("Product Found:");
            foundProduct.displayDetails();
        }
        else{
            System.out.println("Product Not found");
        }

        sc.close();

    }
}
