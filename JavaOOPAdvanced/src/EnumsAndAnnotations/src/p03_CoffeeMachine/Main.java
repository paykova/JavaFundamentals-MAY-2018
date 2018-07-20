package p03_CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line;

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        while(!"END".equals(line = reader.readLine())){
            String[] cmdArgs = line.split(" ");

            if(cmdArgs.length == 1){
                coffeeMachine.insertCoin(cmdArgs[0]);
            } else {
                coffeeMachine.buyCoffee(cmdArgs[0], cmdArgs[1]);
            }
        }
        for (Coffee coffee : coffeeMachine.coffeesSold()) {
            System.out.println(coffee);
        }
        
    }
}
