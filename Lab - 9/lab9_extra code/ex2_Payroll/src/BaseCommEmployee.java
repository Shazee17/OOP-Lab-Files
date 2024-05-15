public class BaseCommEmployee extends ComEmployee {
    private double baseSalary;
    void setBaseSalary(double s){
        this.baseSalary =s;
    }
    double getBaseSalary(){
        return  this.baseSalary;
    }

    BaseCommEmployee(){

    }

    BaseCommEmployee(String first, String last, String cn , double sales, double rate, double baseSalary){
        super(first, last, cn, sales, rate);
        this.baseSalary = baseSalary;
    }

    public double earning(){
        return super.earning() + baseSalary;
    }


    public String toStr(){
        String s = super.toStr();
        return s + String.format("Weekly salary as per Hours: %.2f", earning());
    }

}

