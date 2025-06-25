package good_implementation;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getVehicle("Truck");
        v1.start();
        v1.stop();

        v1 = VehicleFactory.getVehicle("Bike");
        v1.start();
        v1.stop();

        v1 = VehicleFactory.getVehicle("Car");
        v1.start();
        v1.stop();
    }
}
