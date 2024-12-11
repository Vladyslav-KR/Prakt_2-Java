package Task_4;

public class EmailSubscriber implements Subscriber {
    @Override
    public void update(String news) {
        System.out.println("Email subscriber received: " + news);
    }
}
