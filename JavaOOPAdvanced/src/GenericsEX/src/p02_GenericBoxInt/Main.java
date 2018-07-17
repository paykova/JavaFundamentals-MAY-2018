package p02_GenericBoxInt;

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
            int line = Integer.parseInt(reader.readLine());
            list.add(new Box(line));
        }

        for (Box box : list) {
            System.out.println(box.toString());
        }
    }
}
