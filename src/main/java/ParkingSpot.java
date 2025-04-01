import models.Vehicle;
import models.VehicleType;

public class ParkingSpot {


    private VehicleType vehicleType;
    private int parkingSpotNumber;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    private Vehicle parkedVehicle;

    public synchronized boolean isAvailable() {
        return isAvailable;
    }

    private boolean isAvailable;


    public ParkingSpot(VehicleType vehicleType, int parkingSpotNumber) {
        this.vehicleType = vehicleType;
        this.parkingSpotNumber = parkingSpotNumber;
        this.isAvailable = false;
    }

    public synchronized void parkVehicle(Vehicle vehicle) {
        if(isAvailable() && vehicle.getType() == vehicleType) {
            parkedVehicle = vehicle;
        } else {
            throw new IllegalArgumentException("SS");
        }
    }

    public synchronized void unparkVehicle(Vehicle vehicle) {
        parkedVehicle = null;
    }


}
