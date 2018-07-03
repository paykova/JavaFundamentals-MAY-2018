package p01_BankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Map<Integer, BankAccount> map = new HashMap<>();

        String[] line = reader.readLine().split(" ");

        while (!"End".equals(line[0])) {
            String command = line[0];
            int id = Integer.parseInt(line[1]);

            switch (command) {
                case "Create":
                    if (!map.containsKey(id)) {
                        BankAccount acc = new BankAccount();
                        acc.setId(id);
                        map.put(id, acc);
                    } else {
                        System.out.println("Account already exists");
                    }
                    break;
                case "Deposit":
                    int amount = Integer.parseInt(line[2]);
                    if (!map.containsKey(id)) {
                        System.out.println("Account does not exist");
                    } else {
                        map.get(id).deposit(amount);
                    }
                    break;
                case "Withdraw":
                    int money = Integer.parseInt(line[2]);
                    if(map.containsKey(id)){
                        if(map.get(id).getBalance() >= money){
                            map.get(id).withdraw(money);
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "Print":
                    if(!map.containsKey(id)){
                        System.out.println("Account does not exist");
                    } else {
                        System.out.printf("Account ID%d, balance %.2f", id, map.get(id).getBalance());
                    }
                    break;
            }
            line = reader.readLine().split(" ");
        }

        // System.out.printf("Account %s, balance %.2f", acc, acc.getBalance());


    }

}
