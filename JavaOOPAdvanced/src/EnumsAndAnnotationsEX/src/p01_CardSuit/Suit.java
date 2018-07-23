package p01_CardSuit;

import java.util.Iterator;

public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;

    @Override
    public String toString() {
        return String.format("Ordinal value: %s; Name value: %s", this.ordinal(), this.name());
    }
}
