//Lab 11: Excercise 7
interface Pet{
    void play();

    String getName();
    void setName(String name);

}


abstract class Animal{
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();
    
    void walk(){
        System.out.println("Animal walks on " + legs + " legs.");
    }

}

class Spider extends Animal{

    public Spider(int legs) {
        super(legs);
    }

    @Override
    void eat() {
        System.out.println("Spider eats insects.");
    }

}

class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Cat eats fish.");
    }


    @Override
    public void play() {
        System.out.println("Cat plays with ball of yarn.");
    }
}

class Fish extends Animal implements Pet{
    private String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    public Fish() {
        super(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Fish eats fish food.");
    }

    @Override
    public void play() {
        System.out.println("Fish plays with bubbles.");
    }

    @Override
    void walk(){
        System.out.println("Fish cannot walk.");
    }
}



public class Exercise7 {
    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers");
        Fish myFish = new Fish("Goldie");

      
        myCat.setName("Fluffy");
        myFish.setName("Bubbles");

        myCat.eat();
        myCat.play();
        myCat.walk();

        System.out.println("Cat's name: " + myCat.getName());

        System.out.println();

        myFish.eat();
        myFish.play();
        myFish.walk(); 

        System.out.println("Fish's name: " + myFish.getName());
    }

}
