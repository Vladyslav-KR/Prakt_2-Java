package Task_1.com.example.vehicles;

public class Truck  extends Vehicle implements Refuelable {

    public Truck(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping...");
    }

    @Override
    public void refuel() {
        System.out.println("Truck is being refueled...");
    }
}
