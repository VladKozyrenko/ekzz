public class EncryptedNotification implements Notification {
    private Notification wrappee;

    public EncryptedNotification(Notification wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getContent() {
        return "Encrypted(" + wrappee.getContent() + ")";
    }

    @Override
    public void nextState() {
        wrappee.nextState();
    }
}
