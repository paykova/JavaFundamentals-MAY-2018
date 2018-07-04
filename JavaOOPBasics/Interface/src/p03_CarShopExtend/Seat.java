package p03_CarShopExtend;

public class Seat implements Sellable {

    String model;
    String color;
    Integer horsePower;

    private Double price;
    private String countryProduced;

    public Seat(String model, String color, Integer horsePower, Double price, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.price = price;
        this.countryProduced = countryProduced;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String getModel() {

        return this.model;
    }

    @Override
    public String getColor() {

        return this.color;
    }

    @Override
    public Integer getHorsePower() {

        return this.horsePower;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getModel())
                .append(" is ").append(this.getColor()).append(" and have ")
                .append(this.getHorsePower()).append(" horse powers").append(System.lineSeparator())
                .append("This is ").append(this.getModel()).append(" produced in ")
                .append(this.countryProduced).append(" and have ").append(TIRES).append(" tires");

        return sb.toString();
    }
}
