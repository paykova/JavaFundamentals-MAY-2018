package p03_CarShopExtend;

public class Main {

    public static void main(String[] args) {

        Sellable seat = new Seat("Leon", "Gray", 110, 11111.1, "Spain");
        Rentable audi = new Audi("Leon", "Gray", 110, 3, 99.9, "Spain");

        System.out.println(seat);
        System.out.println(audi);
    }

}
