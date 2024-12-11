package Task_1.com.example.vehicles;

import java.util.Scanner;
public class VehicleApp  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Створюємо транспортні засоби
        Vehicle car = new Car("Toyota", "Corolla", 2020);
        Vehicle bike = new Bike("Yamaha", "FZ", 2019);
        Vehicle truck = new Truck("Volvo", "FH16", 2018);

        // Меню для взаємодії з користувачем
        while (true) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Start car");
            System.out.println("2. Stop car");
            System.out.println("3. Refuel car");
            System.out.println("4. Start bike");
            System.out.println("5. Stop bike");
            System.out.println("6. Start truck");
            System.out.println("7. Stop truck");
            System.out.println("8. Refuel truck");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    car.start();
                    break;
                case 2:
                    car.stop();
                    break;
                case 3:
                    if (car instanceof Refuelable) {
                        ((Refuelable) car).refuel();
                    } else {
                        System.out.println("This vehicle cannot be refueled.");
                    }
                    break;
                case 4:
                    bike.start();
                    break;
                case 5:
                    bike.stop();
                    break;
                case 6:
                    truck.start();
                    break;
                case 7:
                    truck.stop();
                    break;
                case 8:
                    if (truck instanceof Refuelable) {
                        ((Refuelable) truck).refuel();
                    } else {
                        System.out.println("This vehicle cannot be refueled.");
                    }
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

}
