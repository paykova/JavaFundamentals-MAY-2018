package p08_CardGame;

public class Card implements Comparable<Card>{

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    private int getPower(){
        return this.rank.getValue() + this.suit.getValue();
    }

    @Override
    public int compareTo(Card other) {
        return this.getPower() - other.getPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.rank, this.suit);
    }


}
