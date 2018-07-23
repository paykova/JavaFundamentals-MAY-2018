package p07_DeckOfCards;


public class Card{

    private Rank cardRank;
    private Suit cardSuits;

    public Card(Rank cardRank, Suit cardSuits) {
        this.cardRank = cardRank;
        this.cardSuits = cardSuits;
    }

    @Override
    public String toString() {
        return String.format("%s of %s",
                this.cardRank,
                this.cardSuits);
    }
}