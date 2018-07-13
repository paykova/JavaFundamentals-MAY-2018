package GenericsEX.p01_GenericBox;

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
        }

        for (Box<String> box : boxes) {
            System.out.println(box);
        }
    }
}
