package p05_CardCompareTo;

public class Card implements Comparable<Card>{

    private Rank cardRank;
    private Suit cardSuits;

    public Card(String rank, String suit) {
        this.setCardRank(rank);
        this.setCardSuits(suit);
    }

    private void setCardRank(String cardRank) {
        this.cardRank = Enum.valueOf(Rank.class, cardRank.toUpperCase());
    }

    private void setCardSuits(String cardSuits) {
        this.cardSuits = Enum.valueOf(Suit.class, cardSuits.toUpperCase());
    }

    public Rank getCardRank() {
        return this.cardRank;
    }

    public Suit getCardSuits() {
        return this.cardSuits;
    }

    public int getPower() {
        return this.getCardRank().getPower() + this.getCardSuits().getPower();
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.getPower(), other.getPower());
    }

    @Override
    public String toString() {
        return String.format("%s of %s",
                this.getCardRank().name(),
                this.getCardSuits().name());
    }
}