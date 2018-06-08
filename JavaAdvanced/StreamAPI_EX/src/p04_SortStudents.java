import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


import static java.lang.System.in;

public class p04_SortStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<String> list = new ArrayList<>();

        while (true) {
            String input = reader.readLine();

            if ("END".equals(input)) {
                break;
            }
            if (input.isEmpty()) {
                continue;
            }
            list.add(input);
        }
        list.stream()
                .sorted((s1, s2) -> {
                    if (s1.split("\\s+")[1].compareTo(s2.split("\\s+")[1]) == 0) {
                        return s2.split("\\s+")[0].compareTo(s1.split("\\s+")[0]);
                    } else {
                        return s1.split("\\s+")[1].compareTo(s2.split("\\s+")[1]);
                    }
                })
                .forEach(System.out::println);
    }
}
