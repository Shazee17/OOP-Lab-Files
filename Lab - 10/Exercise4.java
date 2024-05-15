interface Employee {
    void details();
}

interface Officer {
    void info();
}

class Person implements Employee, Officer {
    public void details() {
        System.out.println("Employee details");
    }

    public void info() {
        System.out.println("Officer info");
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Person person = new Person();
        person.details();
        person.info();
    }
}