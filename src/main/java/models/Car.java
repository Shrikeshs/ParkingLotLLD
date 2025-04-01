package models;

public class Car  extends Vehicle{
    public Car(String licenseNumber) {
        super(licenseNumber, VehicleType.CAR);
    }

    @Override
    protected int getDetails() {
        return 1222;
    }
}
