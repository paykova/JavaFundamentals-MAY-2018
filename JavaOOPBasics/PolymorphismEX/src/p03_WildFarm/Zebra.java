package p03_WildFarm;

public class Zebra extends Mammal {

    private static final String DEFAULT_SOUND = "Zs";

    public Zebra(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println(DEFAULT_SOUND);
    }

    @Override
    void eat(Food food) {
        if(food instanceof Meat){
            throw new IllegalArgumentException(ConfigExMessage.WRONG_TYPE_FOOD_ZEBRA_EX_MESSAGE);
        }
        super.eat(food);
    }
}
