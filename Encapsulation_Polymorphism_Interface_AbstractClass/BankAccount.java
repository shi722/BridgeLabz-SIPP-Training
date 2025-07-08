package Encapsulation_Polymorphism_Interface_AbstractClass;

public abstract class BankAccount {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public BankAccount(String num, String name, double balance) {
        this.accountNumber = num;
        this.holderName = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String num, String name, double balance) {
        super(num, name, balance);
    }

    public double calculateInterest() {
        return 0.04 * balance;
    }

    public void applyForLoan(double amount) {
        System.out.println("Savings Loan Applied: ₹" + amount);
    }

    public boolean calculateLoanEligibility() {
        return balance >= 5000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String num, String name, double balance) {
        super(num, name, balance);
    }

    public double calculateInterest() {
        return 0.02 * balance;
    }

    public void applyForLoan(double amount) {
        System.out.println("Current Loan Applied: ₹" + amount);
    }

    public boolean calculateLoanEligibility() {
        return balance >= 10000;
    }
}
