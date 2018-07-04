package p02_CarShop;

import java.io.Serializable;

public class Seat implements Car, Serializable {

   private String countryProduced;
   private String model;
   private String color;
   private Integer horsePower;

    public Seat(String countryProduced, String model, String color, Integer horsePower) {
        this.countryProduced = countryProduced;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
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


    //Leon is gray and have 110 horse powers
    //This is Leon produced in Spain and have 4 tires
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(this.getModel())
                .append(" is ").append(this.getColor()).append(" and have ")
                .append(this.getHorsePower()).append(" horse powers").append(System.lineSeparator())
                .append("This is ").append(this.getModel()).append(" produced in ").append(this.countryProduced)
                .append(" and have ").append(TIRES).append(" tires");

        return sb.toString();
//        return String.format("%s is %s and have %d horse powers%nThis is %s produced in %s and have %d tires",
//                this.getModel(),
//                this.getColor(),
//                this.getHorsePower(),
//                this.getModel(),
//                this.countryProduced);
    }
}
