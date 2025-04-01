package models;

public class Truck extends Vehicle{
    public Truck(String licenseNumber) {
        super(licenseNumber, VehicleType.TRUCK);
    }

    @Override
    protected int getDetails() {
        return 0;
    }
}
