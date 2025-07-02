package Inheritance;

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

 class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }
}

  class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("This is a Checking Account.");
    }
}

   class FixedDepositAccount extends BankAccount {
    int termInMonths;

    public FixedDepositAccount(String accountNumber, double balance, int termInMonths) {
        super(accountNumber, balance);
        this.termInMonths = termInMonths;
    }

    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }
}
