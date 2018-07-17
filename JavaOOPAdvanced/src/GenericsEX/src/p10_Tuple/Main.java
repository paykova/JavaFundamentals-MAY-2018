package p10_Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<Tuple> tuples = new ArrayList<>();

        String[] tokens = reader.readLine().split("\\s+");
        String fullName = String.format("%s %s", tokens[0], tokens[1]);
        String address = tokens[2];
        tuples.add(new Tuple(fullName, address));

        tokens = reader.readLine().split("\\s+");
        String name = tokens[0];
        int lt = Integer.parseInt(tokens[1]);
        tuples.add(new Tuple(name, lt));

        tokens = reader.readLine().split("\\s+");
        int intNumber = Integer.parseInt(tokens[0]);
        double doubleNumber = Double.parseDouble(tokens[1]);
        tuples.add(new Tuple(intNumber, doubleNumber));

        tuples.forEach(System.out::println);
    }
}
