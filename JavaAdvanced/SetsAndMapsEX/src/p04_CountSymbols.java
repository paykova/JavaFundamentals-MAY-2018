import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;

public class p04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        char[] input = scanner.nextLine().toCharArray();

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i <input.length ; i++) {
            char currentChar = input[i];
            if (!map.containsKey(currentChar)){
                map.put(currentChar, 0);
            }
            map.put(currentChar, map.get(currentChar) + 1);
        }

        for (Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
            System.out.print(mapEntry.getKey() + ": " + mapEntry.getValue() + " time/s");
            System.out.println();
        }
    }
}
