import java.util.Scanner;

import static java.lang.System.in;

public class AvrOfThreeNumbers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();

        double avr = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.printf("%.2f", avr);
    }
}
