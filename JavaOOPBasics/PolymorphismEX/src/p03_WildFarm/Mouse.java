package p03_WildFarm;

public class Mouse extends Mammal {

    private static final String DEFAULT_SOUND = "SQUEEEAAAK!";

    public Mouse(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println(DEFAULT_SOUND);
    }

    @Override
    void eat(Food food) {
        if(food instanceof Meat){
            throw new IllegalArgumentException(ConfigExMessage.WRONG_TYPE_FOOD_MOUSE_EX_MESSAGE);
        }
        super.eat(food);
    }
}
