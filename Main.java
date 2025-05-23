public class Main {
    public static void main(String[] args) {
        NotificationService service = NotificationService.getInstance();

        Subscriber user1 = new UserSubscriber("Олег");
        Subscriber user2 = new UserSubscriber("Анна");

        service.subscribe(user1);
        service.subscribe(user2);

        Notification notif = new BasicNotification("Акція! Нові товари.");
        notif = new EncryptedNotification(notif);
        notif = new AdNotification(notif);

        service.send(notif);

        notif.nextState();
        System.out.println("Поточний статус повідомлення: " + notif.getContent());
    }
}
