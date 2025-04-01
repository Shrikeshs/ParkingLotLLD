public class ParkingDemo {

    public static void run() {
        ParkingLot parkingLot = ParkingLot.getInstance();

        parkingLot.addLevels(new Level(1, 100));
    }
}
