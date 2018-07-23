package p03_CardsWithPower;

public class Card {

    private Rank cardRank;
    private Suit cardSuit;

    public Card(String cardRank, String cardSuit) {
        this.setCardRank(cardRank);
        this.setCardSuit(cardSuit);
    }

    public Rank getCardRank() {
        return this.cardRank;
    }

    public void setCardRank(String cardRank) {
        this.cardRank = Enum.valueOf(Rank.class, cardRank);
    }

    public Suit getCardSuit() {
        return this.cardSuit;
    }

    public void setCardSuit(String cardSuit) {
        this.cardSuit = Enum.valueOf(Suit.class, cardSuit);
    }

    public int power(){
        return this.getCardRank().getRankPower() + this.getCardSuit().getSuitPower();
    }

    @Override
    public String toString() {
        //return String.format("%s of %s", this.cardRank, this.cardSuit);
        return String.format("%s of %s", this.getCardRank().name(), this.getCardSuit().name());
    }
}
