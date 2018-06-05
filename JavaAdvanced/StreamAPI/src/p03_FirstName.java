import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class p03_FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> names = Arrays.asList(reader.readLine().split(" "));
        HashSet<Character> letters = new HashSet<>();

        Stream.of(reader.readLine().split("\\s+"))
                .map(s -> s.toLowerCase().charAt(0))
                .forEach(c -> letters.add(c));

        Optional<String> first = names.stream()
                .filter(s -> letters.contains(s.toLowerCase().charAt(0)))
                .sorted()
                .findFirst();

        if(first.isPresent()){
            System.out.println(first.get());
        } else {
            System.out.println("No match");
        }
    }
}
