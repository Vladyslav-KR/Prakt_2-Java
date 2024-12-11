package Task_4;

public class SMSSubscriber implements Subscriber {
    @Override
    public void update(String news) {
        System.out.println("SMS subscriber received: " + news);
    }
}
