package Task_4;

import java.util.Scanner;

public class NotificationApp {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter notification type (email, sms, push): ");
        String type = scanner.nextLine();

        try {
            Notification notification = factory.createNotification(type);
            notification.send();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}