class Employee {
    private String firstName;
    private String lastName;
    private String CNIC;

    public Employee() {}

    public Employee(String firstName, String lastName, String CNIC) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNIC = CNIC;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " CNIC# " + CNIC;
    }

    public double earnings() {
        return 0.00;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee() {}

    public SalariedEmployee(String firstName, String lastName, String CNIC, double weeklySalary) {
        super(firstName, lastName, CNIC);
        if (weeklySalary >= 0)
            this.weeklySalary = weeklySalary;
        else
            System.out.println("Weekly salary cannot be negative.");
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >= 0)
            this.weeklySalary = weeklySalary;
        else
        System.out.println(
            "Weekly salary cannot be negative."
        );
    }

    @Override
    public String toString() {
        return "\nSalaried employee: " + super.toString();
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String CNIC, double wage, double hours) {
        super(firstName, lastName, CNIC);
        if (wage >= 0)
            this.wage = wage;
        else
            throw new IllegalArgumentException("Wage cannot be negative.");
        if (hours >= 0)
            this.hours = hours;
        else
            throw new IllegalArgumentException("Hours cannot be negative.");
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage >= 0)
            this.wage = wage;
        else
            throw new IllegalArgumentException("Wage cannot be negative.");
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0)
            this.hours = hours;
        else
            throw new IllegalArgumentException("Hours cannot be negative.");
    }

    @Override
    public String toString() {
        return "\nHourly employee: " + super.toString();
    }

    @Override
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }
}

class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String CNIC, double grossSales, double commissionRate) {
        super(firstName, lastName, CNIC);
        if (grossSales >= 0)
            this.grossSales = grossSales;
        else
            System.out.println("Error: Gross sales cannot be negative.");
        
        if (commissionRate >= 0)
            this.commissionRate = commissionRate;
        else
            System.out.println("Error: Commission rate cannot be negative.");
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0)
            this.grossSales = grossSales;
        else
            System.out.println("Error: Gross sales cannot be negative.");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0)
            this.commissionRate = commissionRate;
        else
            System.out.println("Error: Commission rate cannot be negative.");
    }

    @Override
    public String toString() {
        return "\nCommission employee: " + super.toString();
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String CNIC, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, CNIC, grossSales, commissionRate);
        if (baseSalary >= 0)
            this.baseSalary = baseSalary;
        else
            System.out.println("Error: Base salary cannot be negative.");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0)
            this.baseSalary = baseSalary;
        else
            System.out.println("Error: Base salary cannot be negative.");
    }

    @Override
    public String toString() {
        return "\nBase plus Commission employee: " + super.toString();
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }
}

public class PayRollSystemTest {
    public static void main(String[] args) {
        Employee firstEmployee = new SalariedEmployee("Muhammad", "Ali", "11111-1111", 800.00);
        Employee secondEmployee = new CommissionEmployee("Tarwan", "Kumar", "222-22-2222", 10000, 0.06);
        Employee thirdEmployee = new BasePlusCommissionEmployee("Fabeeha", "Fatima", "333-33-3333", 5000, 0.04, 300);
        Employee fourthEmployee = new HourlyEmployee("Hasnain", "Ali", "444-44-4444", 16.75, 40);

        System.out.println(firstEmployee);
        System.out.println("Earnings: " + firstEmployee.earnings());

        System.out.println(secondEmployee);
        System.out.println("Earnings: " + secondEmployee.earnings());

        System.out.println(thirdEmployee);

        BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee) thirdEmployee;
        double oldBaseSalary = currentEmployee.getBaseSalary();
        System.out.println("Old base salary: " + oldBaseSalary);
        currentEmployee.setBaseSalary(1.10 * oldBaseSalary);
        System.out.println("New base salary with 10% increase is: " + currentEmployee.getBaseSalary());

        System.out.println("Earnings: " + thirdEmployee.earnings());

        System.out.println(fourthEmployee);
        System.out.println("Earnings: " + fourthEmployee.earnings());
    }
}
