package solid.dip.after;

// High-level module: Messaging application depending on abstraction (MessageSender interface)
public class MessagingApp {
    private MessageSender messageSender;

    public MessagingApp(MessageSender messageSender) {
        this.messageSender = messageSender; // Dependency on abstraction (MessageSender)
    }

    public void sendMessage(String to, String message) {
        messageSender.sendMessage(to, message);
    }
}