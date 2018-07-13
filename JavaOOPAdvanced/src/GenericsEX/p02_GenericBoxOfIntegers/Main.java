package GenericsEX.p02_GenericBoxOfIntegers;

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

        List<Box<Integer>> boxes = new ArrayList<>();
        String[] elements = new String[n];

        for (int i = 0; i <n ; i++) {
            elements[i] = reader.readLine();
            Integer input = Integer.parseInt(elements[i]);
            boxes.add(new Box<>(input));
        }
        boxes.forEach(System.out::println);
    }
}
