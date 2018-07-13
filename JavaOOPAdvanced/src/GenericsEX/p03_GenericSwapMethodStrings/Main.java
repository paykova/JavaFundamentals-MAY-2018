package GenericsEX.p03_GenericSwapMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        List<Box<String>> boxes = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i <n ; i++) {
            String input = reader.readLine();
            boxes.add(new Box<>(input));
        }

        String[] indexes = reader.readLine().split("\\s+");

        int first = Integer.parseInt(indexes[0]);
        int second = Integer.parseInt(indexes[1]);


        Box<String> temp = boxes.get(first);
        boxes.set(first, boxes.get(second));
        boxes.set(second, temp);

        for (Box<String> box : boxes) {
            System.out.println(box.toString());
        }

    }
}
