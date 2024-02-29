public class EmployeeInfo {
    double salary;
    int workPerDay;
    
    void collectInfo(double salary, int workPerDay){
        this.salary = salary;
        this.workPerDay = workPerDay;
    }

    void addWork(){
        if(workPerDay > 6){
            salary = salary + 5;
        }
    }

    double printFinalSalary(){
        return this.salary;
    }

    public static void main(String[] args) {
        EmployeeInfo employee = new EmployeeInfo(); 
        // Collect employee information 
        employee.collectInfo(1000, 8); 
        // Assuming $1000 salary and 8 hours of work // Add work bonus if applicable 
        employee.addWork(); 
        // Print final salary 
        System.out.println(employee.printFinalSalary());
    }
}
