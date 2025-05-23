public class NewState implements NotificationState {
    @Override
    public String getName() { return "Нове"; }
    @Override
    public NotificationState next() { return new SentState(); }
}
