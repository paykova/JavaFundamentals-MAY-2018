package p01_Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {

    private static final double TRUCK_SUMMER_INCREASE_COEFFICIENT = 1.6;
    private static final double POSSIBLE_REFUEL_GIVEN_FUEL_IN_PERCENT = 95.0F;

    public Truck(double fuelQuantity, double fuelConsumptionLiterPerKm) {
        super(fuelQuantity, fuelConsumptionLiterPerKm);
    }


    @Override
    public void refueling(double liters) {
        if(liters > 0){
            super.setFuelQuantity(super.getFuelQuantity() + (liters*(POSSIBLE_REFUEL_GIVEN_FUEL_IN_PERCENT / 100)));
        }


    }

    @Override
    public void driving(double km){
        double temp = this.getFuelQuantity() / (this.getFuelConsumptionLiterPerKm() + TRUCK_SUMMER_INCREASE_COEFFICIENT);
        if(temp >= km  ){
            System.out.printf("p01_Vehicles.p02_VehiclesExtension.Truck travelled %s km%n", new DecimalFormat("########0.##").format(km));
            this.setFuelQuantity(this.getFuelQuantity() - (km * (this.getFuelConsumptionLiterPerKm() + TRUCK_SUMMER_INCREASE_COEFFICIENT)));
        } else {
            System.out.println("p01_Vehicles.p02_VehiclesExtension.Truck needs refueling");
        }
    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.getClass().getSimpleName(), new DecimalFormat("##########0.00").format(this.getFuelQuantity()));
    }


}
