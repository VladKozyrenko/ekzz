public class AdNotification implements Notification {
    private Notification wrappee;

    public AdNotification(Notification wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getContent() {
        return wrappee.getContent() + " [Знижки на товари!]";
    }

    @Override
    public void nextState() {
        wrappee.nextState();
    }
}
