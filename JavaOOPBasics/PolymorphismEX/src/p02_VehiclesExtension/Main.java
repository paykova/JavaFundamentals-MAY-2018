package p02_VehiclesExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<Vehicle> list = new ArrayList<>();


        String[] line = reader.readLine().split(" ");
        Double carFuelQuantity = Double.parseDouble(line[1]);
        Double carLtPerKm = Double.parseDouble(line[2]);
        int carTankCapacity = Integer.parseInt(line[3]);


        Vehicle car = new Car(carFuelQuantity, carLtPerKm, carTankCapacity);
        list.add(car);

        String[] input = reader.readLine().split(" ");
        Double truckFuelQuantity = Double.parseDouble(input[1]);
        Double truckLtPerKm = Double.parseDouble(input[2]);
        int truckTankCapacity = Integer.parseInt(input[3]);

        Vehicle truck = new Truck(truckFuelQuantity, truckLtPerKm, truckTankCapacity);
        list.add(truck);

        String[] data = reader.readLine().split(" ");
        Double busFuelQuantity = Double.parseDouble(data[1]);
        Double busLtPerKm = Double.parseDouble(data[2]);
        int busTankCapacity = Integer.parseInt(input[3]);

        Vehicle bus = new Bus(busFuelQuantity, busLtPerKm, busTankCapacity);
        list.add(bus);


        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i <n ; i++) {

            String[] commandLine = reader.readLine().split(" ");
            String command = commandLine[0];
            String type = commandLine[1];
            //int amount = Integer.parseInt(commandLine[2]);
            double amount = Double.parseDouble(commandLine[2]);


            try{
                switch (command){
                    case "Drive":
                        for (Vehicle vehicle : list) {
                          if(vehicle.getClass().getSimpleName().equals(type)){
                              System.out.println(vehicle.drive(amount));
                          }
                        }
                        break;
                    case "Refuel":
                        for (Vehicle vehicle : list) {
                            if(vehicle.getClass().getSimpleName().equals(type)){
                               vehicle.refuel(amount);
                            }
                        }
                        break;
                    case "DriveEmpty":
                        for (Vehicle vehicle : list) {
                            if(vehicle.getClass().getSimpleName().equals("p02_VehiclesExtension.Bus")){
                                System.out.println(((Bus) bus).driveEmpty(amount));
                            }
                        }
                        break;
                }
            } catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }

        list.forEach(System.out::println);
    }
}
