public class HourlyEmployee extends  Employee {
    private double hourlySalary;
    int hours;

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }
    @Override
    public double earning() {
        if (hours<=40){
            return hourlySalary*hours;
        }
        else {
            return hourlySalary*40 + (hours-40) * hourlySalary*1.5;
        }
    }

    HourlyEmployee(){

    }
    HourlyEmployee(String first, String last, String cn , double hourlySalary , int hours){
        super(first, last, cn);
        this.hourlySalary = hourlySalary ;
        this.hours = hours ;
    }

    public String toStr(){
        String s = super.toStr();
        return s + String.format("Weekly salary as per Hours: %.2f", earning());
    }

}

