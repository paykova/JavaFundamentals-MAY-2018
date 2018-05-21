import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CalculateExpression_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("\\s+");

        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);

        double pow = a + b + c;
        double sqrt = Math.sqrt(c);
        double sum1 = (a*a + b*b);
        double sum2 = (a*a - b*b);
        double sum = sum1 / sum2;

        double stepen = pow / sqrt;
        double f1 = Math.pow(sum, stepen);

        double secondSum = a*a + b*b - c*c*c;
        double stepen2 = a-b;
        double f2 = Math.pow(secondSum, stepen2);

        double avr1 = ( a + b + c ) / 3;
        double avr2 = (f1 + f2) /2;
        double absolute = Math.abs(avr1 - avr2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, absolute);
    }

}
