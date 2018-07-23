package p01_CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Suit[] suits = Suit.values();

        String input = reader.readLine();

        System.out.println(input + ":");
        for (Suit suit : suits) {
            System.out.println(suit.toString());
        }
    }
}
