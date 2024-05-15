class Maths {
    public void display() {
        System.out.println("Hello, I am the display method of class Maths");
    }
}

class Algebra extends Maths {
    @Override
    public void display() {
        System.out.println("Hello, I am the display method of Algebra");
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        // Upcasting
        Maths math = new Algebra();
        
        math.display(); 
    }
}
