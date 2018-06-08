import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.lang.System.in;

public class p08_WeakStudents {
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
                .filter(s -> {
                    List<Integer> grades = s.getValue();
                    int count = 0;
                    for (Integer grade : grades) {
                        if (grade <= 3) {
                            count++;
                        }
                    }
                    return count >= 2;
                })
                .forEach(s -> System.out.println(s.getKey()));

    }
}
