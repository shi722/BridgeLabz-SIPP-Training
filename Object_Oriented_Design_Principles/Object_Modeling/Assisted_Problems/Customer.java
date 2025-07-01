package Object_Oriented_Design_Principles.Object_Modeling.Assisted_Problems;

public class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + " has balance: Rs." + balance);
    }
}

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c) {
        System.out.println(c.name + " opened account in " + bankName);
    }
}