package p02_Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] line = reader.readLine().split(" ");
        Map<Integer, BankAccount> map = new HashMap<>();

        while(!"End".equals(line[0])){
            BankAccount acc = new BankAccount();
            String commmand = line[0];

            switch(commmand){

                case "Create":

                    map.put(acc.getId(), acc);
                    System.out.printf("Account ID%d created%n", acc.getId());
                    break;

                case "Deposit":
                    int id = Integer.parseInt(line[1]);
                    double amount = Double.parseDouble(line[2]);
                    if (map.containsKey(id)){
                       map.get(id).deposit(amount);
                        System.out.printf("Deposited %.2f to ID%d%n", amount, id);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;

                case "GetInterest":
                    try {
                        int years = Integer.parseInt(line[2]);
                        int idd = Integer.parseInt(line[1]);
                        System.out.printf("%.2f%n", map.get(idd).getInterest(years));
                    } catch (Exception ex){
                        System.out.println("Account does not exist");
                    }
                    break;

                case "SetInterest":
                    double temp = Double.parseDouble(line[1]);
                    BankAccount.setInterestRate(temp);
                    break;
            }
            line = reader.readLine().split(" ");
        }
    }
}
