package oop.encapsulation;

public class BankAccount {
    // Private fields
    private int balance;

    // Constructor
    public BankAccount(int initialBalance) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }

    // Public method to deposit money
    public void deposit(int amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }

    // Public method to withdraw money
    public void withdraw(int amount) {
        if (amount > 0.0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Public method to get the balance
    public int getBalance() {
        return balance;
    }
}