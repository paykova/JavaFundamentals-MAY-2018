package p10_Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<Threeuple> threeuples = new ArrayList<>();

        String[] line1 = reader.readLine().split("\\s+");
        String fullName = String.format("%s %s", line1[0], line1[1]);
        String address = line1[2];
        String secondAddress = line1[3];
        threeuples.add(new Threeuple(fullName, address, secondAddress));

        String[] tokens2 = reader.readLine().split("\\s+");
        String name = tokens2[0];
        int lt = Integer.parseInt(tokens2[1]);
        String drunkOrNot = tokens2[2];
        //check(drunkOrNot);
        threeuples.add(new Threeuple(name, lt, checkCondition(drunkOrNot)));

        String[] input3 = reader.readLine().split("\\s+");
        String simpleName = input3[0];
        double account = Double.parseDouble(input3[1]);
        String bankName = input3[2];
        threeuples.add(new Threeuple(simpleName, account, bankName));

        threeuples.forEach(System.out::println);
    }

    private static boolean checkCondition(String drunkOrNot) {
        if (drunkOrNot.equals("drunk")){
            return true;
        }
        return false;
    }
}
