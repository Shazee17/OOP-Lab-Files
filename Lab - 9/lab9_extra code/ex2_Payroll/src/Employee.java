public class Employee {
private String fName, lName, cnic;
    Employee(){

    }
    Employee(String first, String last, String cn){
        fName = first;
        lName = last;
        cnic = cn;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCnic() {
        return cnic;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
    public String toStr(){
        return String.format("First Name: %-10s Last Name: %s CNIC: %s", fName, lName, cnic);
    }

    public double earning(){
        return 0;
    }

}

