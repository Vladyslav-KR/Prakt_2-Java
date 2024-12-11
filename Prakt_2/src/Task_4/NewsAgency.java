package Task_4;

import java.util.ArrayList;
import java.util.List;

// Клас NewsAgency генерує новини та сповіщає підписників
public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    // Додає підписника до списку
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Видаляє підписника зі списку
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Публікує новини та сповіщає всіх підписників
    public void publishNews(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}