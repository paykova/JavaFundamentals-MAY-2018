import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

import static java.lang.System.in;

public class p06_FindAndSumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Optional<Integer> num = Arrays.stream(reader.readLine().split("\\s+"))
                .filter(x -> !x.isEmpty())
                .filter(x -> {
                    try {
                        Integer.parseInt(x);
                        return true;
                    } catch (Exception e) {
                        return false;
                    }
                })
                .map(Integer::parseInt)
                .reduce((x, y) -> x + y);

        System.out.println(num.isPresent() ? num.get() : "No match");
    }
}

