import models.Vehicle;

import java.util.*;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private final ArrayList<Level> levels;

    //Singleton class
    private ParkingLot() {
        levels=  new ArrayList<>();
    }

    public static synchronized ParkingLot getInstance() {
        if(parkingLot == null) {
            parkingLot =new ParkingLot();
        }

        return parkingLot;
    }


    public void addLevels(Level level) {
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for(Level level : levels) {
            return level.parkVehicle(vehicle);
        }
        return false;
    }


    public boolean unparkVehicle(Vehicle vehicle) {
        for(Level level:levels) {
            return level.unparkVehicle(vehicle);
        }
        return false;
    }


    //parkVehicle
    //unparkVhicle
    //getType
    //getNumberof Avaivlbe
    //


}
