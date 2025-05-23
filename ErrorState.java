public class ErrorState implements NotificationState {
    @Override
    public String getName() { return "Помилка"; }
    @Override
    public NotificationState next() { return new NewState(); }
}
