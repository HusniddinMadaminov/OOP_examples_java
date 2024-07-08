package solid.dip.before;

// High-level module: Messaging application using EmailSender directly
public class MessagingApp {

    private EmailSender emailSender;

    public MessagingApp() {
        this.emailSender = new EmailSender(); // Dependency on concrete EmailSender
    }

    public void sendMessage(String to, String message) {
        emailSender.sendEmail(to, message);
    }
}

/*

    Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules;
    both should depend on abstractions. Additionally, abstractions should not depend on details; details
    should depend on abstractions. This principle helps in decoupling modules and promoting flexibility,
    extensibility, and testability in software design.

 */