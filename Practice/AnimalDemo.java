// Animal superclass
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }
}


// Mammal subclass - inherits from Animal
class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal -> Animal [name=" + getName() + "]";
    }
}

// Cat subclass - inherits from Mammal
class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat -> Mammal -> Animal [name=" + getName() + "]";
    }
}

// Dog subclass - inherits from Mammal
class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog -> Mammal -> Animal [name=" + getName() + "]";
    }
}

public class AnimalDemo {

    public static void main(String[] args) {
        Cat mittens = new Cat("Tom");
        Dog buddy = new Dog("Spike");

        System.out.println(mittens); 
        mittens.greets(); 

        System.out.println(buddy); 
        buddy.greets(); 

        buddy.greets(buddy); 
    }
}
