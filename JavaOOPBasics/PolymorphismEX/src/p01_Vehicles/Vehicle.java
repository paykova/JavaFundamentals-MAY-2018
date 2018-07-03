package p01_Vehicles;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumptionLiterPerKm;

    public Vehicle(double fuelQuantity, double fuelConsumptionLiterPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionLiterPerKm = fuelConsumptionLiterPerKm;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumptionLiterPerKm() {
        return fuelConsumptionLiterPerKm;
    }

    public void setFuelConsumptionLiterPerKm(double fuelConsumptionLiterPerKm) {
        this.fuelConsumptionLiterPerKm = fuelConsumptionLiterPerKm;
    }

    public abstract void driving(double km);
    public abstract void refueling(double liters);



}
