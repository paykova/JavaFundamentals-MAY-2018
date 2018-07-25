package p08_CardGame;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        this.seedDeck();
    }

    private void seedDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(rank, suit);
                this.cards.add(card);
            }
        }
    }

    public boolean containsCard(Card card) {
        return this.cards
                .stream()
                .anyMatch(innerCard -> innerCard.getRank().equals(card.getRank()) &&
                                innerCard.getSuit().equals(card.getSuit()));
    }

    public void removeCard(Card card){

        this.cards.removeIf(innerCard -> innerCard.getRank().equals(card.getRank()) &&
                        innerCard.getSuit().equals(card.getSuit()));
    }
}
