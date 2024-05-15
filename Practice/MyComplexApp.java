import java.util.Scanner;

class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public boolean isImaginary() {
        return (real == 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
}

class MyComplexTest {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(1.1, 2.2);
        MyComplex complex2 = new MyComplex(3.3, 4.4);

        //Testing all methods
        System.out.println("Complex Number 1: " + complex1);
        System.out.println("Complex Number 1 is real: " + complex1.isReal());
        System.out.println("Complex Number 1 is imaginary: " + complex1.isImaginary());

        System.out.println("\nComplex Number 2: " + complex2);
        System.out.println("Complex Number 2 is real: " + complex2.isReal());
        System.out.println("Complex Number 2 is imaginary: " + complex2.isImaginary());

        System.out.println("\nComplex Equality Check: " + complex1.equals(complex2));
        System.out.println("Magnitude of Complex Number 1: " + complex1.magnitude());
        System.out.println("Magnitude of Complex Number 2: " + complex2.magnitude());

        System.out.println("\nAdd into complex 1 with complex 2: " + complex1.addInto(complex2));
        System.out.println("Add new complex 1 with complex 2: " + complex1.addNew(complex2));
    }
}

class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        MyComplex complex1 = new MyComplex(real1, imag1);

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        MyComplex complex2 = new MyComplex(real2, imag2);

        // Print values
        System.out.println("\nNumber 1 is: " + complex1);
        System.out.println(complex1 + (complex1.isReal() ? " is" : " is NOT") + " a pure real number");
        System.out.println(complex1 + (complex1.isImaginary() ? " is" : " is NOT") + " a pure imaginary number");

        System.out.println("\nNumber 2 is: " + complex2);
        System.out.println(complex2 + (complex2.isReal() ? " is" : " is NOT") + " a pure real number");
        System.out.println(complex2 + (complex2.isImaginary() ? " is" : " is NOT") + " a pure imaginary number");

        // Check for equality
        System.out.println("\n" + complex1 + " is" + (complex1.equals(complex2) ? "" : " NOT") + " equal to " + complex2);

        // Arithmetic operations
        System.out.println(complex1 + " + " + complex2 + " = " + complex1.addNew(complex2));

        scanner.close();
    }
}
