package p02_VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle{

    private static final double BUS_FUEL_INCREASE = 1.4;
    private static final String BUS_NEEDS_REFUELING = "p02_VehiclesExtension.Bus needs refueling";

    @Override
    public String drive(double amount) {

        double temp = super.getFuelQuantity() / (super.getFuelConsumption() + BUS_FUEL_INCREASE);
        if (temp < amount){
            throw new IllegalArgumentException(BUS_NEEDS_REFUELING);
        }
        super.setFuelQuantity(super.getFuelQuantity() - (amount * (super.getFuelConsumption() + BUS_FUEL_INCREASE)));
        return String.format(this.getClass().getSimpleName() + " travelled " +  new DecimalFormat("#########0.##").format(amount) + " km");
    }


    public String driveEmpty(double amount) {

        double temp = getFuelQuantity() / (getFuelConsumption());
        if (temp < amount){
            throw new IllegalArgumentException(BUS_NEEDS_REFUELING);
        }
        super.setFuelQuantity(super.getFuelQuantity() - (amount * (super.getFuelConsumption())));
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
        super.setFuelQuantity(super.getFuelQuantity() + amount);
    }

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);

    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.getClass().getSimpleName(),
                new DecimalFormat("##########0.00").format(this.getFuelQuantity()));
    }
}
