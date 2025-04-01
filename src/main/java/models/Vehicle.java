package models;


public abstract class Vehicle {

    protected String licenseNumber;
    protected VehicleType vehicleType;
    protected abstract int getDetails();

    public Vehicle(String licenseNumber, VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        this.licenseNumber= licenseNumber;
    }

    public VehicleType getType() {
        return vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

}
