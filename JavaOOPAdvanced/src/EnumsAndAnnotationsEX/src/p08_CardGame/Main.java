package p08_CardGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Player firstPlayer = new Player (reader.readLine());
        Player secondPlayer = new Player (reader.readLine());

        Game game = new Game(firstPlayer, secondPlayer);
        Deck deck = new Deck();

        while (true){

            if (firstPlayer.isHandFull() && secondPlayer.isHandFull()){
                break;
            }

            String[] tokens = reader.readLine().split("\\s+of\\s+");

            Card card = null;
            try {
                Rank rank = Rank.valueOf(tokens[0]);
                Suit suit = Suit.valueOf(tokens[1]);

                card = new Card(rank, suit);

            }catch (IllegalArgumentException iae){
                System.out.println("No such card exists.");
                continue;
            }

            if (!deck.containsCard(card)){
                System.out.println("Card is not in the deck.");
                continue;
            }

            deck.removeCard(card);

            if (firstPlayer.getHandSize() < 5){
                firstPlayer.add(card);
            }else if (secondPlayer.getHandSize() < 5) {
                secondPlayer.add(card);
            }
        }

        Player winner = game.getWinner();
        System.out.println(String.format("%s wins with %s.",
                winner.getName(), winner.getPowerfulCard()));

    }
}
