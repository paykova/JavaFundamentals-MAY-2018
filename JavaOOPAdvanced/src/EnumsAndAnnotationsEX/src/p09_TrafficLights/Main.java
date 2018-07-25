package p09_TrafficLights;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;
import static java.lang.System.lineSeparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));


        List<TrafficMachine> trafficMachines = new ArrayList<>();

        String[] tokens = reader.readLine().split("\\s+");
        for (String token : tokens) {
            trafficMachines.add(new TrafficMachine(token));
        }

        int rotations = Integer.parseInt(reader.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <rotations ; i++) {
            for (TrafficMachine trafficMachine : trafficMachines) {
                trafficMachine.changeLight();
                sb.append(trafficMachine.toString()).append(" ");
            }
            sb.append(System.lineSeparator());
        }
        System.out.println(sb.toString());
    }
}
