import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        String[][] employeeRecords = {
                {"0x001", "50_000"},
                {"0x002", "65_000"},
                {"0x003", "80_000"},
                {"0x004", "70_000"},
                {"0x005", "60_000"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID to search: ");
        String searchId = scanner.nextLine();

        int employeeIndex = -1;
        for (int i = 0; i < employeeRecords.length; i++) {
            if (employeeRecords[i][0].equalsIgnoreCase(searchId)) {
                employeeIndex = i;
                break;
            }
        }

        if (employeeIndex != -1) {
            System.out.println("Employee found:");
            System.out.println("Employee ID: " + employeeRecords[employeeIndex][0]);
            System.out.println("Salary: $" + employeeRecords[employeeIndex][1]);
        } else {
            System.out.println("Employee not found.");
        }

        double totalSalaries = 0;
        for (String[] record : employeeRecords) {
            int salary = Integer.parseInt(record[1].replace("_", ""));
            totalSalaries += salary;
        }

        double averageSalary = totalSalaries / employeeRecords.length;
        System.out.println("Average Salary: $" + averageSalary);


        scanner.close();
    }
}
