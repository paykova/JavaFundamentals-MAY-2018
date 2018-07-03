package p04_ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    private static final String STOP = "END";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Map<String, Person> personDB = new LinkedHashMap<>();
        Map<String, Product> productDB = new HashMap<>();

        try {
            fillPersonDB(personDB, reader);
            fillProductDB(productDB, reader);

            String line;
            while (!STOP.equalsIgnoreCase(line = reader.readLine())) {
                buyTheProducts(personDB, productDB, line);
            }
            personDB.values().forEach(System.out::println);
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    private static void buyTheProducts(Map<String, Person> personDB, Map<String, Product> productDB, String line){
        String[] lineTokens = line.split("\\s+");
        String personName = lineTokens[0];
        String productName = lineTokens[1];

        try {
            personDB.get(personName).buyProduct(productDB.get(productName));
            System.out.println(String.format("%s bought %s", personName, productName));
        } catch (IllegalArgumentException iaeForBuying){
            System.out.println(iaeForBuying.getMessage());
        }
    }

    private static void fillProductDB(Map<String, Product> productDB, BufferedReader reader) throws IOException{
        String[] personArr = reader.readLine().trim().split(";");

        for (String s : personArr) {
            String[] tokens = s.split("=");
            String name = tokens[0];
            double cost = Double.parseDouble(tokens[1]);

            Product product = new Product(name, cost);

            if(productDB.containsKey(name)){
                productDB.get(name).addNewCost(cost);
            }
            productDB.putIfAbsent(name, product);
        }
    }

    private static void fillPersonDB(Map<String, Person> personDB, BufferedReader reader ) throws IOException {
        String[] arr = reader.readLine().trim().split(";");

        for (String s : arr) {
            String[] token = s.split("=");
            String name = token[0];
            double money = Double.parseDouble(token[1]);

            Person person = new Person(name, money);

            if (personDB.containsKey(name)){
                personDB.get(name).addMoneyToBudget(money);
            }
            personDB.putIfAbsent(name, person);
        }
    }
}
