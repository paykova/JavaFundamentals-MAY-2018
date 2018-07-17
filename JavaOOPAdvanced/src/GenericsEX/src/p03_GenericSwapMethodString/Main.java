package p03_GenericSwapMethodString;

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
        List<Box> list = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String line = reader.readLine();
            list.add(new Box(line));
        }

        String[] swapNumbers = reader.readLine().split(" ");
        int first = Integer.parseInt(swapNumbers[0]);
        int second = Integer.parseInt(swapNumbers[1]);

        Box<String> temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);

        for (Box box : list) {
            System.out.println(box.toString());

        }
    }
}
