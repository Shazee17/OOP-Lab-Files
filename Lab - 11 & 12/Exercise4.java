abstract class Marks {
    abstract void getPercentage();
}

class A extends Marks {
    int sub1, sub2, sub3;

    public A(int s1, int s2, int s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    void getPercentage() {
        double percentage = (sub1 + sub2 + sub3) / 3.0;
        System.out.println("Percentage of A: " + percentage);
    }
}

class B extends Marks {
    int sub1, sub2, sub3, sub4;

    public B(int s1, int s2, int s3, int s4) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }

    void getPercentage() {
        double percentage = (sub1 + sub2 + sub3 + sub4) / 4.0; 
        System.out.println("Percentage of B: " + percentage);
    }
}

public class Exercise4 {

    public static void main(String[] args) {
        // create object of A and B classes
        A objA = new A(45, 40, 94);
        B objB = new B(43, 52, 64, 26);

        objA.getPercentage();
        objB.getPercentage();
    }
}
