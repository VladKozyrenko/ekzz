public class DeliveredState implements NotificationState {
    @Override
    public String getName() { return "Доставлене"; }
    @Override
    public NotificationState next() { return new ErrorState(); }
}
