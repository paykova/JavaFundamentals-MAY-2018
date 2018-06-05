import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p08_BoundedNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<Integer> num = Arrays.stream(reader.readLine()
                .split(" "))
                .sorted()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

       Arrays.stream(reader.readLine()
                .split(" "))
                .sorted()
                .map(Integer::parseInt)
                .filter(x -> x >= num.get(0) && x <= num.get(1))
                .collect(Collectors.toList())
                .forEach(a -> System.out.print((a) + " "));
    }
}
