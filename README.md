# Parking Lot System

## Overview
This is a simple Java-based Parking Lot system implemented using Object-Oriented Programming (OOP) principles. It includes features for parking and unparking vehicles while utilizing a singleton design pattern for the parking lot instance.

## Features
- **Singleton Design Pattern**: Ensures only one instance of the `ParkingLot` class exists.
- **Vehicle Parking & Unparking**: Allows vehicles to be parked in and removed from the parking lot.
- **Multi-level Parking Support**: The parking lot can accommodate multiple levels.
- **Thread-Safety**: Synchronized methods prevent race conditions.

## Technologies Used
- Java
- Object-Oriented Programming (OOP)

## Project Structure
```
project-root/
├── src/
│   ├── ParkingLot.java
│   ├── ParkingSpot.java
│   ├── models/
│   │   ├── Vehicle.java
│   │   ├── VehicleType.java
│   ├── Level.java
│   ├── Main.java
│
├── README.md
├── pom.xml (if using Maven)
├── build.gradle (if using Gradle)
```

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/parking-lot.git
   ```
2. Navigate to the project directory:
   ```sh
   cd parking-lot
   ```
3. Compile the Java files:
   ```sh
   javac -d bin src/**/*.java
   ```
4. Run the application:
   ```sh
   java -cp bin Main
   ```

## Usage
1. Create an instance of the Parking Lot:
   ```java
   ParkingLot parkingLot = ParkingLot.getInstance();
   ```
2. Add levels to the Parking Lot:
   ```java
   parkingLot.addLevels(new Level(1));
   ```
3. Park a vehicle:
   ```java
   Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
   boolean success = parkingLot.parkVehicle(car);
   ```
4. Unpark a vehicle:
   ```java
   boolean removed = parkingLot.unparkVehicle(car);
   ```

## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch (`feature-branch`).
3. Commit your changes.
4. Push to your forked repository.
5. Create a pull request.

## License
This project is licensed under the MIT License. See `LICENSE` for details.

## Contact
For any inquiries, contact [Shrikeh Suresh(mailto:shrikeshs98@gmail.com).
