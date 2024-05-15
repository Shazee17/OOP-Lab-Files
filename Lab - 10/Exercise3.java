interface Animal {
    void legs();
    void eat();
}

class Spider implements Animal {
    @Override
    public void legs() {
        System.out.println("A spider has 8 legs.");
    }

    @Override
    public void eat() {
        System.out.println("A spider eats insects.");
    }
}

class Caterpillar implements Animal {
    @Override
    public void legs() {
        System.out.println("A caterpillar has many legs.");
    }

    @Override
    public void eat() {
        System.out.println("A caterpillar eats leaves.");
    }
}

class Cat implements Animal {
    @Override
    public void legs() {
        System.out.println("A cat has 4 legs.");
    }

    @Override
    public void eat() {
        System.out.println("A cat eats fish and meat.");
    }
}

 public class Exercise3 {
    
    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.legs();
        spider.eat();

        Caterpillar caterpillar = new Caterpillar();
        caterpillar.legs();
        caterpillar.eat();

        Cat cat = new Cat();
        cat.legs();
        cat.eat();
    }
    
}


