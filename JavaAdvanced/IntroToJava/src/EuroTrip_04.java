import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.System.in;

public class EuroTrip_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        double quantity = Double.parseDouble(scanner.nextLine());
        double pricePerKilo = 1.20;
        BigDecimal priceInLevs = new BigDecimal(pricePerKilo * quantity);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");

        BigDecimal inDeutscheMark = exchangeRate.multiply(priceInLevs);

        System.out.printf("%.2f marks", inDeutscheMark);

    }
}
