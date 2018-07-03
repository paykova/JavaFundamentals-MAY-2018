package p02_Person;

public class BankAccount {

    private final static double DEFAULT_INTEREST = 0.02;

    private int id = 1;
    private double balance;

    private static double rate = DEFAULT_INTEREST;
    private static int bankAccountCount;

    public BankAccount() {
        rate = DEFAULT_INTEREST;
        this.id = ++bankAccountCount;
    }

    public static double getDefaultInterest() {

        return DEFAULT_INTEREST;
    }

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

    public static void setInterestRate(double interest){
        rate = interest;
    }

    public double getInterest(int years){
        return this.balance * rate* years;
    }

    public void deposit(double amount){

        this.balance = this.balance + amount;
    }


}
