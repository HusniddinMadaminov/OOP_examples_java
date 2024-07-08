package oop.encapsulation;

public class Main {

    private static final int BALANCE = 1_000_000;

    public static void main(String[] args) {
        BankAccount account = new BankAccount(BALANCE);
        account.deposit(500_000);
        account.withdraw(100_000);
        System.out.println("Current balance: " + account.getBalance()); // Outputs: Current balance: 1_400_000
    }

    /*

    Advantages of Encapsulation:

    1. Improved Data Security and Integrity;
    2. Enhanced Maintainability and Flexibility;
    3. Reduced Complexity;
    4. Increased Reusability;
    5. Ease of Testing and Debugging;

    */

}
