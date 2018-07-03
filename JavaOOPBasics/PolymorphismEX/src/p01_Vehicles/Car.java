package p01_Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    private static final double CAR_SUMMER_INCREASE_COEFFICIENT = 0.9;

    public Car(double fuelQuantity, double fuelConsumptionLiterPerKm) {
        super(fuelQuantity, fuelConsumptionLiterPerKm);
    }

    @Override
    public double getFuelQuantity() {
        return super.getFuelQuantity();
    }

    @Override
    public void refueling(double liters) {
        if(liters>0){
            super.setFuelQuantity(super.getFuelQuantity() + liters);
        }

    }

    @Override
    public void driving(double km){
        double temp = this.getFuelQuantity() / (this.getFuelConsumptionLiterPerKm() + CAR_SUMMER_INCREASE_COEFFICIENT);
        if(temp >= km  ){
            System.out.printf("p01_Vehicles.p02_VehiclesExtension.Car travelled %s km%n", new DecimalFormat("#############0.##").format(km));
            this.setFuelQuantity(this.getFuelQuantity() - (km * (this.getFuelConsumptionLiterPerKm() + CAR_SUMMER_INCREASE_COEFFICIENT)));
        } else {
            System.out.println("p01_Vehicles.p02_VehiclesExtension.Car needs refueling");
        }
    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.getClass().getSimpleName(), new DecimalFormat("############0.00").format(this.getFuelQuantity()));
    }
}
