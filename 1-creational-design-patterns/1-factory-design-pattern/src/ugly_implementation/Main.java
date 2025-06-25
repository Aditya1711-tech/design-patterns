package ugly_implementation;

import ugly_implementation.concrete_vehicles.Bike;
import ugly_implementation.concrete_vehicles.Car;
import ugly_implementation.concrete_vehicles.Truck;

public class Main {
    public static void main(String[] args) {
        String vehicleType = "Car"; // Imagine this value is dynamic
        Vehicle vehicle = switch (vehicleType) {
            case "Car" -> new Car();
            case "Truck" -> new Truck();
            case "Bike" -> new Bike();
            default -> throw new IllegalArgumentException("Unknown vehicle type");
        };
        vehicle.start();
        vehicle.stop();
    }
}
