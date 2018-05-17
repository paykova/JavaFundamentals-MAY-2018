import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.Bidi;
import java.util.Scanner;

import static java.lang.System.in;

public class ProductOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());

        BigInteger sum =  BigInteger.ONE;
        BigInteger total;

        for (int i = n; i <= m; i++) {
            BigInteger num = new BigInteger("" + i);
            sum = sum.multiply(num);
        }

       /* do {
           BigInteger number = new BigInteger("" + n);
           sum = sum.multiply(number);
           n++;
        } while (n <= m); */
        System.out.printf("product[%d..%d] = %f", n, m, sum);
    }
}
