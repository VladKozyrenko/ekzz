public class BasicNotification implements Notification {
    private String content;
    private NotificationState state;

    public BasicNotification(String content) {
        this.content = content;
        this.state = new NewState();
    }

    @Override
    public String getContent() {
        return content + " [" + state.getName() + "]";
    }

    @Override
    public void nextState() {
        state = state.next();
    }
}
