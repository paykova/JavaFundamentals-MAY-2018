package p02_BookShop ;

public class GoldenEditionBook extends Book{

    private final double DEFAULT_ADDITIONAL_VALUE = 0.3;

    public GoldenEditionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + super.getPrice() * DEFAULT_ADDITIONAL_VALUE;
    }
}
