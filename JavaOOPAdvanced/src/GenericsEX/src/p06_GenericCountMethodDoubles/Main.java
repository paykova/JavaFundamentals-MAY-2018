package p06_GenericCountMethodDoubles;

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
            double line = Double.parseDouble(reader.readLine());
            list.add(new Box(line));
        }
        double other = Double.parseDouble(reader.readLine());

        System.out.println(result(list, other));


    }

    private static  long result(List<Box> list, double other) {
        return list.stream()
                .filter(e -> e.compareTo(new Box(other)) > 0)
                .count();
    }
}
