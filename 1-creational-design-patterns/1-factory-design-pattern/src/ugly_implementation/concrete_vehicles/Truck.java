package ugly_implementation.concrete_vehicles;

import ugly_implementation.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }
}
