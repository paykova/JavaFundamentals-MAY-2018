import java.util.Scanner;

import static java.lang.System.in;

public class TransportPrice_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double distance = Double.parseDouble(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        double price = 0;

        if (distance < 20){
            if (timeOfDay.equals("day")){
                price = 0.70 + (0.79 * distance);
            }
            else if (timeOfDay.equals("night")) {
                price = 0.70 + (0.90 * distance);
            }
        }
        else if (distance >= 20 && distance <100){
            price = 0.09 * distance;
        }
        else if (distance > 100){
            price = 0.06 * distance;
        }

        System.out.printf("%.2f", price);
    }
}
