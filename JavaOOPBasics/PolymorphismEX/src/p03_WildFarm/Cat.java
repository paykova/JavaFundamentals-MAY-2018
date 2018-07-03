package p03_WildFarm;

import java.text.DecimalFormat;

public class Cat extends Feline {

    private static final String DEFAULT_SOUND = "Meowwww";

    private String breed;

    public Cat(String name, double weight, String livingRegion, String breed) {
        super(name, weight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        if(breed == null || breed.trim().isEmpty()){
            throw new IllegalArgumentException(ConfigExMessage.EMPTY_CAT_BREED_EX_MESSAGE);
        }
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(DEFAULT_SOUND);

    }

    @Override
    void eat(Food food) {
        super.eat(food);
    }

   @Override
    public String toString(){
        return String.format(CAT_TO_STRING_PATTERN,
                this.getClass().getSimpleName(),
                this.getName(),
                this.getBreed(),
                new DecimalFormat(DECIMAL_FORMAT_PATTERN).format(this.getWeight()),
                this.getLivingRegion(),
                this.getFoodEaten());
   }
}
