import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class p04_CountSameValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        //double[] arr = Arrays.stream(scanner.nextLine().split(" "))
        // .mapToDouble(Double::parseDouble).toArray();

        Map<String, Integer> countedNumbers = new HashMap<>();

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i <input.length ; i++) {
            String currentNumber = input[i];
            if (!countedNumbers.containsKey(currentNumber + "")){
                countedNumbers.put(currentNumber + "", 0);
            }
            countedNumbers.put(currentNumber + "", countedNumbers.get(currentNumber + "") +1);
        }

        for (Map.Entry<String, Integer> numbers : countedNumbers.entrySet()) {
            System.out.println(numbers.getKey() + " - " + numbers.getValue() + " times");
        }
    }
}