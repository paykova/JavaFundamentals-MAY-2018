package GenericsEX.p04_GenericSwapMethodIntegers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(reader.readLine());

        List<Box<Integer>> boxesOfIntegers = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String input = reader.readLine();
            int number = Integer.parseInt(input);
            boxesOfIntegers.add(new Box<>(number));
        }

        String[] indexes = reader.readLine().split("\\s+");

        int first = Integer.parseInt(indexes[0]);
        int second = Integer.parseInt(indexes[1]);

        Box<Integer> temp = boxesOfIntegers.get(second);


        boxesOfIntegers.set(second, boxesOfIntegers.get(first));
        boxesOfIntegers.set(first, temp);

        for (Box<Integer> boxesOfInteger : boxesOfIntegers) {
            System.out.println(boxesOfInteger.toString());
        }
    }
}
