package Task_4;

import java.util.Scanner;

public class NewsAgencyApp {
    public static void main(String[] args) {
        // Створення агентства новин
        NewsAgency newsAgency = new NewsAgency();
        Scanner scanner = new Scanner(System.in);

        // Запитуємо користувача, скільки підписників він хоче додати
        System.out.print("How many subscribers do you want to add? ");
        int numberOfSubscribers = scanner.nextInt();
        scanner.nextLine();  // Споживаємо залишковий символ після вводу числа

        // Додавання підписників
        for (int i = 0; i < numberOfSubscribers; i++) {
            System.out.print("Enter subscriber " + (i + 1) + " name: ");
            String name = scanner.nextLine();

            // Створення підписника через лямбда-вираз
            Subscriber subscriber = news -> System.out.println(name + " received news: " + news);
            newsAgency.addSubscriber(subscriber);
        }

        // Публікація новини
        while (true) {
            System.out.print("\nEnter news to publish (or 'exit' to quit): ");
            String news = scanner.nextLine();

            if ("exit".equalsIgnoreCase(news)) {
                break;
            }

            // Публікація новин
            newsAgency.publishNews(news);
        }

        // Закриваємо сканер
        scanner.close();
    }
}