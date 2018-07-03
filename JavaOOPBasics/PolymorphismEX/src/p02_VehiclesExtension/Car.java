package p02_VehiclesExtension;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    private static final double CAR_FUEL_INCREASE = 0.9;
    private static final String CAR_NEEDS_REFUELING = "p02_VehiclesExtension.Car needs refueling";



    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String drive(double amount) {
        double temp = getFuelQuantity() / (getFuelConsumption() + CAR_FUEL_INCREASE);
        if (temp < amount){
            throw new IllegalArgumentException(CAR_NEEDS_REFUELING);
        }
        super.setFuelQuantity(super.getFuelQuantity() - (amount * (super.getFuelConsumption() + CAR_FUEL_INCREASE)));
        return String.format(this.getClass().getSimpleName() + " travelled " +  new DecimalFormat("#########0.##").format(amount) + " km");
    }

    @Override
    public void refuel(double amount) {

        if (amount <= 0){
            throw new IllegalArgumentException(FUEL_MUST_BE_POSITIVE);
        }
        if (amount > super.getTankCapacity()){
            throw new IllegalArgumentException(CANNOT_FIT_TANK);
        }
        setFuelQuantity(getFuelQuantity() + amount);
    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.getClass().getSimpleName(),
                new DecimalFormat("##########0.00").format(this.getFuelQuantity()));
    }
}
