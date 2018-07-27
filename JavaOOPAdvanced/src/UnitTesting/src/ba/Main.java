package ba;

public class Main {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.deposit(20);

        System.out.println(ba.getBalance());
    }
}
