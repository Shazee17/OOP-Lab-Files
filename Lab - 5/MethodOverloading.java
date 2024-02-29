class MethodOverloading {

    void Computations(int length, int width) {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    
    void Computations(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void Computations(double mass, double acceleration) {
        double force = mass * acceleration;
        System.out.println("Force: " + force);
    }

    public static void main(String[] args) {
        MethodOverloading overloading = new MethodOverloading();

        // Call the methods with different parameters
        overloading.Computations(5, 3);        // Area of Rectangle
        overloading.Computations("John", 25);  // Name and Age
        overloading.Computations(10.5, 9.8);   // Force
    }
}
