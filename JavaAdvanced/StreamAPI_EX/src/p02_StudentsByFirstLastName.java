import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class p02_StudentsByFirstLastName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String text = reader.readLine();
        List<String> list = new ArrayList<>();

        while (!"END".equals(text)) {

            list.add(text);
            text = reader.readLine();
        }

        list.stream()
                .filter(s -> (s != null && !s.isEmpty()))
                .filter(s -> s.split("\\s+")[0].compareTo(s.split("\\s+")[1]) < 0)
                .forEach(System.out::println);

    }
}
