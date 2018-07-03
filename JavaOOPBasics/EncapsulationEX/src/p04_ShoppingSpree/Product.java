package p04_ShoppingSpree;

public class Product {

    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {

        return name;
    }

    private void setName(String name) {
        if (name.isEmpty() || name == null || name.trim().length()<=0){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public double getCost() {

        return cost;
    }

    public void setCost(double cost) {
        if(cost <= 0){
            throw new IllegalArgumentException("Money cannot be negative.");
        }
        this.cost = cost;
    }

    public void addNewCost(double cost){
        this.setCost(cost);
    }


}
