package ugly_implementation.concrete_vehicles;

import ugly_implementation.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
}
