import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class p13_SerbianUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        //Lepa Brena @Sunny Beach 25 3500
        Map<String, LinkedHashMap<String, Long>> map = new LinkedHashMap<>();
        String text = scanner.nextLine();


        while (!"End".equals(text)) {
            if (text.split(" ").length >= 4) {

                String[] line = text.split(" @");

                String name = line[0];
                String[] rest = line[1].split(" ");
                Long count = Long.parseLong(rest[rest.length - 1]);
                Long tickets = Long.parseLong(rest[rest.length - 2]);
                String city = "";
                int end = rest.length - 2;
                for (int i = 0; i < end; i++) {
                    city += rest[i].trim() + " ";
                }

                if (!map.containsKey(city)) {
                    map.put(city, new LinkedHashMap<>());
                }
                if (!map.get(city).containsKey(name)) {
                    map.get(city).put(name, 0L);
                }
                map.get(city).put(name, map.get(city).get(name) + (tickets * count));
                //System.out.println(name + " " + city + " "+ tickets + " " + count);
                text = scanner.nextLine();
            }else {
                text = scanner.nextLine();
            }
        }

        map.entrySet()
                .stream()
                .forEach(a -> {
                    System.out.println(a.getKey());

                    a.getValue().entrySet()
                            .stream()
                            .sorted((a1, a2) -> Long.compare(a2.getValue(), a1.getValue()))
                            .forEach(b -> {
                                System.out.println("#  " + b.getKey() + " -> " + b.getValue());
                            });
                });
    }
}
