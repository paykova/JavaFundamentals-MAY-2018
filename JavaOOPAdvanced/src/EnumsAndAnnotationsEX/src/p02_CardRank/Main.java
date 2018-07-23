package p02_CardRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();

        System.out.println(input + ":");

       // Ranks[] ranks = Ranks.values();

        for (Ranks rank : Ranks.values()) {
            System.out.println(rank.toString());
        }
    }
}
