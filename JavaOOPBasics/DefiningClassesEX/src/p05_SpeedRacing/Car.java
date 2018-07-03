package p05_SpeedRacing;

import java.util.Map;

public class Car {

    private static final double DEFAULT_DISTANCE_TRAVELED = 0;

    private String model;
    private double fuelAmount;
    private double fuelCostPerKm;
    private double distance;

    public Car(String model, double fuelAmount, double fuelCostPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
        this.distance = DEFAULT_DISTANCE_TRAVELED;
    }

    public Car() {

    }

    public void drive(double km){
        double possibleDistance = this.fuelAmount / this.fuelCostPerKm;
        if(possibleDistance >= km){
            this.fuelAmount -= km * fuelCostPerKm;
            this.distance += km;
        } else {
            throw new IllegalArgumentException("Insufficient fuel for the drive");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f", this.model, this.fuelAmount, this.distance);
    }

}
