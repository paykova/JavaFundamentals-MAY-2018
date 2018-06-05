import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

import static java.lang.System.in;

public class p04_AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        OptionalDouble avr = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .filter(a -> !a.isEmpty())
                .mapToDouble(Double::parseDouble)
                .average();

        if (avr.isPresent()){
            System.out.printf("%.2f", avr.getAsDouble());
        } else{
            System.out.println("No match");
        }
    }
}
