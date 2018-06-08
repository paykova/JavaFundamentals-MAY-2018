import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.in;

public class p13_OfficeStuff {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(reader.readLine());
        Map<String, LinkedHashMap<String, Long>> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            String[] splitLine = Arrays.stream(line.split("[\\\\|\\-\\s+\\s]+"))
                    .filter(s -> !s.equals(""))
                    .toArray(String[]::new);

            String company = splitLine[0];
            Long amount = Long.parseLong(splitLine[1]);
            String product = splitLine[2];

            if (!map.containsKey(company)) {
                map.put(company, new LinkedHashMap<>());
            }
            if (!map.get(company).containsKey(product)) {
                map.get(company).put(product, 0L);
            }
            map.get(company).put(product, map.get(company).get(product) + amount);
        }

        map.entrySet().stream()
                .forEach(s -> {
                    System.out.print(s.getKey() + ": ");
                    StringBuilder sb = new StringBuilder();
                    s.getValue().entrySet().
                            forEach(a -> sb.append(a.getKey()).append("-").append(a.getValue()).append(", "));
                    System.out.println(sb.delete(sb.length() - 2, sb.length() - 1).toString());
                });


//        companies.entrySet()
//                .forEach(c -> {
//                    System.out.printf("%s: ", c.getKey());
//                    StringBuilder sb = new StringBuilder();
//                    c.getValue().entrySet()
//                            .forEach(i -> sb.append(i.getKey()).append("-").append(i.getValue()).append(", "));
//                    System.out.println(sb.delete(sb.length() - 2, sb.length() - 1).toString());
//                });




    }
}
