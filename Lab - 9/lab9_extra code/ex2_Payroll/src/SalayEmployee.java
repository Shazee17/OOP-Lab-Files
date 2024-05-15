public class SalayEmployee extends  Employee {
        private double weekSalary;

        public void setWeekSalary(double weekSalary) {
            this.weekSalary = weekSalary;
        }

        public double getWeekSalary() {
            return weekSalary;
        }
        @Override
        public double earning() {
        return weekSalary;
    }
        SalayEmployee(){

        }
        SalayEmployee(String first, String last, String cn, double ws){
            super(first, last, cn);
            this.weekSalary = ws;
        }

        public String toStr(){
            String s = super.toStr();
            return s + String.format("Weekly salary: %.2f", weekSalary);
        }

}
