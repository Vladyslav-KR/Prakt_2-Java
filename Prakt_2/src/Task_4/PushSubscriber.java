package Task_4;

public class PushSubscriber implements Subscriber {
    @Override
    public void update(String news) {
        System.out.println("Push subscriber received: " + news);
    }
}
