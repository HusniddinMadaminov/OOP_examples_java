package solid.dip.after;

// Low-level module: Email sender implementation
public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String to, String message) {
        // Send email logic
        System.out.println("Sending email to " + to + ": " + message);
    }
}