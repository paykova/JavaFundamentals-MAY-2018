package p03_CarShopExtend;

public class Audi implements Rentable {

    String model;
    String color;
    Integer horsePower;

    private Integer minRentDay;
    private Double pricePerDay;
    private String countryProduced;

    public Audi(String model, String color, Integer horsePower, Integer minRentDay, Double pricePerDay, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
        this.countryProduced = countryProduced;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
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
