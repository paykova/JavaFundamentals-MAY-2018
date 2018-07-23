package p06_CustomEnumAnnotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {

    private static final String OUTPUT = "Type = %s, Description = %s";
    private static final String RANK_TYPE = "Rank";
    private static final String SUIT_TYPE = "Suit";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();

        if (RANK_TYPE.equals(input)){
            Class<Rank> rankClass = Rank.class;
            if(rankClass.isAnnotationPresent(CustomAnnotation.class)){
                CustomAnnotation annotation = rankClass.getAnnotation(CustomAnnotation.class);
                System.out.println(String.format(OUTPUT, annotation.type(), annotation.description()));
            }

        } else if (SUIT_TYPE.equals(input)){
            Class<Suit> suitClass = Suit.class;
            if (suitClass.isAnnotationPresent(CustomAnnotation.class)){
                CustomAnnotation annotation = suitClass.getAnnotation(CustomAnnotation.class);
                System.out.println(String.format(OUTPUT, annotation.type(), annotation.description()));
            }
        }
    }
}
