public class SentState implements NotificationState {
    @Override
    public String getName() { return "Відправлене"; }
    @Override
    public NotificationState next() { return new DeliveredState(); }
}
