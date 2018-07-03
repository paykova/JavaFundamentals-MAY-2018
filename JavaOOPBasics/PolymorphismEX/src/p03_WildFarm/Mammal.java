package p03_WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    public static final String MAMMAL_TO_STRING_PATTERN = "%s[%s, %s, %s, %d]";
    public static final String CAT_TO_STRING_PATTERN = "%s[%s, %s, %s, %s, %d]";
    public static final String DECIMAL_FORMAT_PATTERN = "###########.##";

    private String livingRegion;

    public Mammal(String name, double weight, String livingRegion) {
        super(name, weight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }


    @Override
    public String toString(){
        return String.format(MAMMAL_TO_STRING_PATTERN,
                this.getClass().getSimpleName(),
                this.getName(),
                new DecimalFormat(DECIMAL_FORMAT_PATTERN).format(this.getWeight()),
                this.getLivingRegion(),
                this.getFoodEaten());
    }
}
