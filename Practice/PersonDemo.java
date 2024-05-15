class Person {
    private String name;
    private String address;
  
    public Person(String name, String address) {
      this.name = name;
      this.address = address;
    }
  
    public String getName() {
      return name;
    }
  
    public String getAddress() {
      return address;
    }
  
    public void setAddress(String address) {
      this.address = address;
    }
  
    @Override
    public String toString() {
      return "Person [name=" + name + ", address=" + address + "]";
    }
  }
  
  class Student extends Person {
    private String program;
    private int year;
    private double fee;
  
    public Student(String name, String address, String program, int year, double fee) {
      super(name, address);
      this.program = program;
      this.year = year;
      this.fee = fee;
    }
  
    public String getProgram() {
      return program;
    }
  
    public void setProgram(String program) {
      this.program = program;
    }
  
    public int getYear() {
      return year;
    }
  
    public void setYear(int year) {
      this.year = year;
    }
  
    public double getFee() {
      return fee;
    }
  
    public void setFee(double fee) {
      this.fee = fee;
    }
  
    @Override
    public String toString() {
      return "Student [Person " + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
  }
  
  class Staff extends Person {
    private String school;
    private double pay;
  
    public Staff(String name, String address, String school, double pay) {
      super(name, address);
      this.school = school;
      this.pay = pay;
    }
  
    public String getSchool() {
      return school;
    }
  
    public void setSchool(String school) {
      this.school = school;
    }
  
    public double getPay() {
      return pay;
    }
  
    public void setPay(double pay) {
      this.pay = pay;
    }
  
    @Override
    public String toString() {
      return "Staff [Person " + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }
  }
  
public class PersonDemo {
    public static void main(String[] args) {
        // Create a student object
        Student student = new Student("Shahzaman", "Airport Road, Sukkur", "Computer Science", 4, 100000.00);
    
        // Print the student information
        System.out.println(student.toString());
    
        // Modify student information
        student.setYear(3);
        student.setFee(12000.00);
    
        // Print the modified student information
        System.out.println(student.toString());
    
        // Create a staff object
        Staff staff = new Staff("Staff 1", "Mission Road", "Sukkur High School", 50000.00);
    
        // Print the staff information
        System.out.println(staff.toString());
    
        // Modify staff information
        staff.setSchool("IBA Community College");
        staff.setPay(60000.00);
    
        // Print the modified staff information
        System.out.println(staff.toString());
      }
}
