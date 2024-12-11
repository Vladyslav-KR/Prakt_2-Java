package Task_1.com.example.vehicles;

public class Car  extends Vehicle implements Refuelable {

    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void refuel() {
        System.out.println("Car is being refueled...");
    }
}

