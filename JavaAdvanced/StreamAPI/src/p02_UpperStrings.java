import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02_UpperStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Arrays.stream(reader.readLine()
                .split(" "))
                .filter(a -> !a.isEmpty())
                .map(a -> a.toUpperCase())
                .forEach(a -> System.out.print(a + " "));
    }
}

