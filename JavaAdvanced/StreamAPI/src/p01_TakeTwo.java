import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class p01_TakeTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Arrays.stream(reader.readLine()
                .split(" "))
                .filter(a -> !a.isEmpty())
                .distinct()
                .map(Integer::parseInt)
                .filter(x -> x>= 10 && x<=20)
                .limit(2)
                .forEach(b -> System.out.print((b) + " "));
    }
}
