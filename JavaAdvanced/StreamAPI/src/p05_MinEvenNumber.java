import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

import static java.lang.System.in;

public class p05_MinEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        OptionalDouble num = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .filter(a -> !a.isEmpty())
                .mapToDouble(Double::parseDouble)
                .sorted()
                .filter(x -> x % 2 ==0)
                .findFirst();

        if(num.isPresent()){
            System.out.printf("%.2f", num.getAsDouble());
        }else{
            System.out.println("No match");
        }
    }
}
