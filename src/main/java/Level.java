import models.Vehicle;
import models.VehicleType;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Level {

    private int levelNumber;


    private ArrayList<ParkingSpot> parkingSpotList;

    public Level(int levelNumber, int numSpots) {

        this.levelNumber =levelNumber;
        this.parkingSpotList = new ArrayList<>();

        int numBikes = (int) (numSpots *0.40);
        int numCars = (int) (numSpots*0.50);
        for(int i = 0; i< numBikes; i++) {
            parkingSpotList.add(new ParkingSpot(VehicleType.CAR, i));
        }
        for(int i = 0; i< numCars; i++) {
            parkingSpotList.add(new ParkingSpot(VehicleType.CAR, i));
        }
        for(int i = numBikes+numCars+1; i< numSpots; i++) {
            parkingSpotList.add(new ParkingSpot(VehicleType.CAR, i));
        }

    }

    public synchronized boolean parkVehicle( Vehicle vehicle){
        for(ParkingSpot spot: parkingSpotList) {
            if(spot.isAvailable() && spot.getVehicleType() == vehicle.getType())
                spot.parkVehicle(vehicle);
            return true;
        }
        return false;
    }

    public synchronized boolean unparkVehicle(Vehicle vehicle){
        parkingSpotList.stream()
                .filter(spot -> !spot.isAvailable())
                .forEach(spot ->  {
                    if(spot.getParkedVehicle().equals(vehicle)) {
                        spot.unparkVehicle(vehicle);
                    }
                });
        return true;

    }
    public long displayAvailability(Level level) {
        return level.getParkingSpotList().stream()
                .filter(ParkingSpot::isAvailable).count();
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public ArrayList<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

}
