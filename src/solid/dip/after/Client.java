package solid.dip.after;

// Client code setting up and using MessagingApp
public class Client {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessagingApp messagingApp = new MessagingApp(emailSender);

        // Send email message
        messagingApp.sendMessage("example@example.com", "Hello from DIP example!");
    }
}