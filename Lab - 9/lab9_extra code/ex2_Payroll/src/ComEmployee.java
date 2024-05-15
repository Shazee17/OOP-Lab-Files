public class ComEmployee extends  Employee {
    private double sales, rate;

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public double earning() {
            return sales*rate;
    }

    ComEmployee(){

    }
    ComEmployee(String first, String last, String cn , double sales, double rate){
        super(first, last, cn);//Look it this buddy!
        this.sales = sales ;
        this.rate = rate;
    }

    public String toStr(){
        String s = super.toStr();
        return s + String.format("Weekly salary as per Hours: %.2f", earning());
    }

}

