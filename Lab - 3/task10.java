/**
 * <b>Person Class</b>
 * <p>
 * Represents a person with information such as name, age, and address.
 * </p>
 *
 * @author John Doe
 * @version 1.0
 */
public class task10 {

    /**
     * <b>Name of the Person</b>
     * <p>
     * This field stores the name of the person.
     * </p>
     */
    private String name;

    /**
     * <b>Age of the Person</b>
     * <p>
     * This field stores the age of the person.
     * </p>
     */
    private int age;

    /**
     * <b>Address of the Person</b>
     * <p>
     * This field stores the address of the person.
     * </p>
     */
    private String address;

    /**
     * <b>Constructor</b>
     * <p>
     * Initializes a new instance of the {@code Person} class with the specified name, age, and address.
     * </p>
     *
     * @param name    The name of the person.
     * @param age     The age of the person.
     * @param address The address of the person.
     */
    public task10(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * <b>Get the Name</b>
     * <p>
     * Returns the name of the person.
     * </p>
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * <b>Get the Age</b>
     * <p>
     * Returns the age of the person.
     * </p>
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * <b>Get the Address</b>
     * <p>
     * Returns the address of the person.
     * </p>
     *
     * @return The address of the person.
     */
    public String getAddress() {
        return address;
    }

    /**
     * <b>Main Method</b>
     * <p>
     * The entry point for the program.
     * </p>
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Your main program logic goes here
        // For example, creating instances of task10 and performing some operations

        task10 person1 = new task10("John Doe", 25, "123 Main St");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());
    }
}
