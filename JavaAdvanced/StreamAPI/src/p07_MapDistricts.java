import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class p07_MapDistricts {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] input = reader.readLine().split("[:\\s]+");
        int border = Integer.parseInt(reader.readLine());

        Map<String, List<Integer>> map = new HashMap<>();

        //Pld:9 Pld:13 Has:7 Sof:20 Sof:10 Sof:15
        for (int i = 0; i < input.length; i += 2) {
            String city = input[i];
            int distictPopulation = Integer.parseInt(input[i + 1]);

            if (!map.containsKey(city)) {
                map.put(city, new ArrayList<>());
            }
            map.get(city).add(distictPopulation);
        }

        map.entrySet()
                .stream()
                .filter(kvp ->
                        kvp.getValue().stream()
                                .reduce((a, b) -> a + b).get() > border)
                .sorted((a1, a2) -> {
                    int a1sum = a1.getValue().stream().reduce((a, b) -> a + b).get();
                    int a2sum = a2.getValue().stream().reduce((a, b) -> a + b).get();
                    return Integer.compare(a2sum, a1sum);
                }).forEach(kvp -> {
            System.out.print(kvp.getKey() + ": ");

            kvp.getValue()
                    .stream()
                    .sorted((x, y) -> Integer.compare(y, x))
                    .limit(5)
                    .forEach(kv -> System.out.print(kv + " "));
            System.out.println();
        });
    }
}
