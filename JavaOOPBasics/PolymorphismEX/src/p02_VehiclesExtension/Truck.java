package p02_VehiclesExtension;

import java.text.DecimalFormat;

public class Truck extends Vehicle {

    private static final double TRUCK_FUEL_INCREASE = 1.6;
    private static final String TRUCK_NEEDS_REFUELING = "p02_VehiclesExtension.Truck needs refueling";

    @Override
    public String drive(double amount) {
        double temp = getFuelQuantity() / (getFuelConsumption() + TRUCK_FUEL_INCREASE);
        if (temp < amount){
            throw new IllegalArgumentException(TRUCK_NEEDS_REFUELING);
        }
        super.setFuelQuantity(super.getFuelQuantity() - (amount * (super.getFuelConsumption() + TRUCK_FUEL_INCREASE)));
        return String.format(this.getClass().getSimpleName() + " travelled " +  new DecimalFormat("#########0.##").format(amount) + " km");
    }

    @Override
    public void refuel(double amount) {
        if (amount <= 0){
            throw new IllegalArgumentException(FUEL_MUST_BE_POSITIVE);
        }
        if ((0.95 * amount) > super.getTankCapacity()){
            throw new IllegalArgumentException(CANNOT_FIT_TANK);
        }
        setFuelQuantity(getFuelQuantity() + (0.95* amount));
    }

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);

    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.getClass().getSimpleName(),
                new DecimalFormat("##########0.00").format(this.getFuelQuantity()));
    }
}
