import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class p10_PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();
        Map<String, LinkedHashMap<String, Long>> map = new LinkedHashMap<>();

        while (!"report".equals(text)) {

            String[] input = text.split("\\|");

            String city = input[0];
            String country = input[1];
            Long population = Long.parseLong(input[2]);

            if (!map.containsKey(country)) {
                map.put(country, new LinkedHashMap<>());
            }
            if (!map.get(country).containsKey(city)) {
                map.get(country).put(city, 0L);
            }
            map.get(country).put(city, map.get(country).get(city) + population);
            text = scanner.nextLine();
        }

        map.entrySet()
                .stream()
                .sorted((a1, a2) ->
                        Long.compare(a2.getValue().values().stream().mapToLong(Long::longValue).sum(),
                                a1.getValue().values().stream().mapToLong(Long::longValue).sum()))
                .forEach(a -> {
                    System.out.println(a.getKey() + " (total population: " +
                            a.getValue().values().stream().mapToLong(Long::longValue).sum() + ")");

                    a.getValue().entrySet()
                            .stream()
                            .sorted((b1, b2) -> Long.compare(b2.getValue(), b1.getValue()))
                            .forEach(b -> {System.out.println("=>" + b.getKey() + ": " + b.getValue());
                            });
                });
    }
}

