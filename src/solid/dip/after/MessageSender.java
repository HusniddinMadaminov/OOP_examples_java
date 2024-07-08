package solid.dip.after;

// Abstraction: MessageSender interface
public interface MessageSender {
    void sendMessage(String to, String message);
}