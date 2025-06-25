package good_implementation;

import good_implementation.concrete_vehicles.Bike;
import good_implementation.concrete_vehicles.Car;
import good_implementation.concrete_vehicles.Truck;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        return switch (vehicleType) {
            case "Car" -> new Car();
            case "Truck" -> new Truck();
            case "Bike" -> new Bike();
            case null, default -> throw new IllegalArgumentException("Illegal vehicle type");
        };
    }
}
