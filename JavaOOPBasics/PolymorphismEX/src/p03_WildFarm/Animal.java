package p03_WildFarm;

public abstract class Animal {

    private static final int DEFAULT_EATEN_FOOD = 0;

    private String name;
    private double weight;
    private int foodEaten;

    public abstract void makeSound();
     void eat(Food food){
        this.foodEaten += food.getQuantity();
    }

    public Animal(String name, double weight) {
        this.setName(name);
        this.setWeight(weight);
        this.foodEaten = DEFAULT_EATEN_FOOD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException(ConfigExMessage.EMPTY_ANIMAL_NAME_EX_MESSAGE);
        }
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight < 0){
            throw new IllegalArgumentException(ConfigExMessage.NEGATIVE_WEIGHT_EX_MESSAGE);
        }
        this.weight = weight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }
}
