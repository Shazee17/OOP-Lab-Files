//6. Write a Java program to create a class called Animal with a method named move(). 
//Create a subclass called Cheetah that overrides the move() method to run.


class Animal{
    public void move(){
        System.out.println("Animal is moving");
    }
}

class Cheetah extends Animal{
    
    @Override
    public void move(){
        System.out.println("Cheetah is running");
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.move();

        Cheetah cheetah = new Cheetah();

        cheetah.move();
    }
}
