import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

import static java.lang.System.in;

public class p09_StudentsEnrolled {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Map<String, List<Integer>> map = new LinkedHashMap<>();

        while (true) {
            String line = reader.readLine();
            String[] splitLine = line.split("\\s+");

            if ("END".equals(line)) {
                break;
            }

            if (line.isEmpty()) {
                continue;
            } else {
                String names = splitLine[0];
                if (!map.containsKey(names)) {
                    map.put(names, new ArrayList<>());
                }
                for (int i = 1; i < splitLine.length; i++) {
                    map.get(names).add(Integer.parseInt(splitLine[i]));
                }

            }
        }

        map.entrySet().stream()
                .filter(s -> (s.getKey().endsWith("14") || s.getKey().endsWith("15")))
                .forEach(s -> System.out.println(Arrays.toString(s.getValue().toArray()).replaceAll("[\\[\\],]", "")));

    }
}
