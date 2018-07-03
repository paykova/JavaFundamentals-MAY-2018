package p05_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Map<String, Car> map = new LinkedHashMap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            String model = line[0];
            double fuelAmount = Double.parseDouble(line[1]);
            double fuelCostFor1km = Double.parseDouble(line[2]);
            double distance = 0d;
            Car car = new Car(model, fuelAmount, fuelCostFor1km);
            if (!map.containsKey(model)) {
                map.put(model, car);
            }
        }
        String input = reader.readLine();
        while (!"End".equals(input)) {
            String[] splitInput = input.split(" ");
            String mod = splitInput[1];
            double km = Double.parseDouble(splitInput[2]);
            try{
                map.get(mod).drive(km);
            } catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
            input = reader.readLine();
        }
        map.values().forEach(System.out::println);
    }
}
