import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class p06_AminerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, Integer> map = new HashMap<>();

        String text = scanner.nextLine();

        while (!"stop".equals(text)) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!map.containsKey(text)) {
                map.put(text, quantity);
            } else {
                map.put(text, map.get(text) + quantity);
            }
            text = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.printf("%s -> %d%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
    }
}
