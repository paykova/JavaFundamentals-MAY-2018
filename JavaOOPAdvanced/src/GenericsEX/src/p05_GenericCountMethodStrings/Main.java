package p05_GenericCountMethodStrings;

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

        String other = reader.readLine();



        System.out.println(countOfGreatestElement(list, other));

    }

    private static <T extends Comparable<T>> long countOfGreatestElement(List<Box> list, T other) {
        return list.stream()
                .filter(e -> e.compareTo(new Box<>(other)) > 0)
                .count();
    }
}
