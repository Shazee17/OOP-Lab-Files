class Medicine{
    String name;
    double price;
    double availability;
    String formula;


    Medicine(String name, double price, double availability, String formula){
        this.name = name;
        this.price = price;
        this.availability = availability;
        this.formula = formula;
    }

    void updateMedicineQuantity(int quantityToAdd){
        availability += quantityToAdd;
    }   

    void displayDetails(){
        System.out.println(" ** MEDICINE DETAILS **");
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Availability : " + availability);
        System.out.println("Formula : " + formula);
    }
}



public class MedicalInventory {
    public static void main(String[] args) {

        Medicine m1 = new Medicine("Paracetamol", 10.50, 100, "C8H9NO2"); 
        Medicine m2 = new Medicine("Aspirin", 7.75, 50, "C9H8O4");
        Medicine m3 = new Medicine("Amoxicillin", 15.20, 80, "C16H19N3");

        Medicine[] medicines = {m1,m2,m3};

        for (Medicine medicine : medicines) {
            medicine.displayDetails();
            System.out.println();
        }

        medicines[2].updateMedicineQuantity(100);

        medicines[2].displayDetails();
        
    }
}
