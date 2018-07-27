package ba;

public class BankAccount {

    private double balance;

    public BankAccount() {
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount should be more than 0");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount should be more than 0");
        } else if (this.balance < amount) {
            throw new IllegalArgumentException("Not enough money");
        }
        this.balance -= amount;
    }
}
