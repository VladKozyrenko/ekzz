public class UserSubscriber implements Subscriber {
    private String name;

    public UserSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Notification notification) {
        System.out.println(name + " отримав повідомлення: " + notification.getContent());
    }
}
