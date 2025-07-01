package Java_Constructors.Access_Modifiers;

public class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(long accNum, String accHolder, double balance, double interestRate) {
        super(accNum, accHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + accountHolder + ", Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1234567890L, "Rohit Sharma", 50000.0, 3.5);
        sa.displayAccount();
        System.out.println("Balance: ₹" + sa.getBalance());
        sa.deposit(5000);
        sa.withdraw(2000);
        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}

