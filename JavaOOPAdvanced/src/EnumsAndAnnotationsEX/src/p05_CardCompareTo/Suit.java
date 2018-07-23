package p05_CardCompareTo;

public enum Suit {
    CLUBS (0),
    DIAMONDS (13),
    HEARTS (26),
    SPADES (39);

    private int power;

    Suit(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toUpperCase();
    }
}
