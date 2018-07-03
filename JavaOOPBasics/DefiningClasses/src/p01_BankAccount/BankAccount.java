package p01_BankAccount;

public class BankAccount {

    private int id;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    public void withdraw (double amount) {
        this.balance = this.balance - amount;
    }

//    @Override
//    public String toString(){
//        return String.format("ID%d", this.id);
//    }


}
