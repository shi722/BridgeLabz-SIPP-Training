package this_static_final_key_words_and_instanceof_Operator;

public class BankAccount {
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;

    BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;  // using this
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayAccount() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}
