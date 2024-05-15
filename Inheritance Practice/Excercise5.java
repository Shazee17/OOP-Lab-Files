//5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals 
//if the account balance falls below one hundred.

class BankAccount{
    private double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount ){
        System.out.println("Depositing..." + amount);
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount < balance) {
            System.out.println("Withdrawing..." + amount);
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }
    
}

class SavingsAccount extends BankAccount{
    SavingsAccount(double balance){
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount == 100) {
            System.out.println("Unable to withdraw");
        }
        else{
            super.withdraw(amount);
        }
    }
}

public class Excercise5 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        bankAccount.deposit(500);

        bankAccount.withdraw(200);

        System.out.println("Bank Account Balance: $" + bankAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(800);

        savingsAccount.deposit(300);

        savingsAccount.withdraw(500);

        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
    }
}
