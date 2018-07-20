package p03_CoffeeMachine.enums;

public enum CoffeeSize {
    SMALL(50, 50), NORMAL (100, 75), DOUBLE(200, 100);

    private int ml;
    private int price;

    CoffeeSize(int size, int price) {
        this.ml = size;
        this.price = price;
    }

    public int getMl() {
        return this.ml;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name().charAt(0)
                + this.name().substring(1).toLowerCase();
    }
}
