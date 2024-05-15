//Exercise 6

interface Printable {
    void print();
}

class Rectangle implements Printable {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void print() {
        System.out.println("Rectangle: length = " + length + " width = " + width);
    }
}

class SportCar implements Printable {
    String name;
    int number;

    SportCar(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void print() {
        System.out.println("SportCar: name = " + name + " number = " + number);
    }
}

class Manager implements Printable {
    String name;
    int age;

    Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Manager: name = " + name + " age = " + age);
    }
}

public class PrintableDemo {
    public static void main(String[] args) {

        Printable vec[] = {
                new Rectangle(110, 80),
                new SportCar("Toyota", 989621),
                new Rectangle(34, 32),
                new Manager("John", 40),
                new Rectangle(54, 10),
                new SportCar("Audi", 2365644),
                new SportCar("Mazda", 4322343),
                new Manager("Joji", 22)
        };

        for (int index = 0; index < vec.length; index++) {
            vec[index].print();
        }
    }
}