package p03_AnimalFarm;

import java.text.DecimalFormat;

public class Chicken {

    private String name;
    private int age;
    private double productPerDay;


    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

//    public double getProductPerDay() {
//        return productPerDay;
//    }

    public void setProductPerDay(double productPerDay) {
   this.productPerDay = productPerDay;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if ((name.trim().length() <= 0) || (name == null) || (name.isEmpty())) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double getProductPerDay() {
        if (this.getAge() < 6) {
            return this.productPerDay = 2;
        } else if ((this.getAge() > 5) && (this.getAge() < 11)) {
            return this.productPerDay = 1;
        } else if (this.getAge() > 12) {
            return this.productPerDay = 0.75;
        }
        return this.productPerDay = productPerDay;
    }



    @Override

    public String toString() {

        DecimalFormat df = new DecimalFormat("0.##");

        return String.format("Chicken %s (age %d) can produce %s eggs per day.",

                this.getName(),

                this.getAge(),

                df.format(this.getProductPerDay()));
    }
}
