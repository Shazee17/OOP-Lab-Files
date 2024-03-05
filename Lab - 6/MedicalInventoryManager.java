class Medicine {
    String medicineName, strength;
    int quantity;


    Medicine(String medicineName, String strength, int quantity) {
        this.medicineName = medicineName;
        this.strength = strength;
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Strength: " + strength);
        System.out.println("Quantity: " + quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


public class MedicalInventoryManager {
    public static void updateMedicineQuantity(Medicine medicine, int quantityToAdd) {
        int currentQuantity = medicine.getQuantity();
        medicine.setQuantity(currentQuantity + quantityToAdd);
    }

    public static void displayDetails(Medicine medicine) {
        medicine.displayDetails();
    }

    public static void main(String[] args) {
        Medicine medicine1 = new Medicine("Amoxicillin", "250mg", 80);
        Medicine medicine2 = new Medicine("Ibuprofen", "200mg", 60);

        System.out.println("Medicine Details before update:");
        displayDetails(medicine1);
        displayDetails(medicine2);

        updateMedicineQuantity(medicine1, 50);
        updateMedicineQuantity(medicine2, 20);

        System.out.println("\nMedicine Details after update:");
        displayDetails(medicine1);
        displayDetails(medicine2);
    }
}
