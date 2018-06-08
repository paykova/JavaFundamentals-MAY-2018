import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.in;

public class p07_ExcellentStudents {
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
                String names = splitLine[0] + " " + splitLine[1];
                if (!map.containsKey(names)) {
                    map.put(names, new ArrayList<>());
                }

                for (int i = 2; i < splitLine.length; i++) {
                    map.get(names).add(Integer.parseInt(splitLine[i]));
                }


            }
        }

        map.entrySet().stream()
                .filter(s-> s.getValue().contains(6))
                .forEach(s -> System.out.println(s.getKey()));
    }
}
