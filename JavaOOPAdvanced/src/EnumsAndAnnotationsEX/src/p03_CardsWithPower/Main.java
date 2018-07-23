package p03_CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String rankInput = reader.readLine();
        String suitInput = reader.readLine();

        try {
            Card card = new Card (rankInput, suitInput);
            System.out.printf("Card name: %s; Card power: %d", card.toString(), card.power() );
        } catch (IllegalArgumentException ignored){
            ;
        }
    }
}
