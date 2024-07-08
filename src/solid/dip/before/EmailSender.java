package solid.dip.before;

// Low-level module: Email sender implementation
public class EmailSender {
    public void sendEmail(String to, String message) {
        // Send email logic
        System.out.println("Sending email to " + to + ": " + message);
    }
}