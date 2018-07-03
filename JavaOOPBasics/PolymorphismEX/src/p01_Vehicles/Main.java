package p01_Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<Vehicle> vehicleList = new LinkedList<>();

        String[] carInput = reader.readLine().split(" ");
        double carQuantity = Double.parseDouble(carInput[1]);
        double carLiterKm = Double.parseDouble(carInput[2]);
        Vehicle car = new Car(carQuantity, carLiterKm);

        vehicleList.add(car);

        String[] truckInput = reader.readLine().split(" ");
        double truckQuantity = Double.parseDouble(truckInput[1]);
        double truckLiterKm = Double.parseDouble(truckInput[2]);
        Vehicle truck = new Truck(truckQuantity, truckLiterKm);

        vehicleList.add(truck);

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            String command = line[0];

            String vehicleType = line[1];

            switch (command) {
                case "Drive":
                    double km = Double.parseDouble(line[2]);
                    for (Vehicle vehicle : vehicleList) {
                        if (vehicle.getClass().getSimpleName().equals(vehicleType)) {
                            vehicle.driving(km);
                        }
                    }
                    break;
                case "Refuel":
                    double liters = Double.parseDouble(line[2]);
                    for (Vehicle vehicle : vehicleList) {
                        if (vehicle.getClass().getSimpleName().equals(vehicleType)) {
                            vehicle.refueling(liters);
                        }
                    }
                    break;
            }

        }

        System.out.println(car.toString());
        System.out.println(truck.toString());

    }
}
