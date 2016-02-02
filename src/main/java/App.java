/**
 * @author Denys_Uzhvii
 */
public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public void logEvent(String msg) {
        String message = msg.replaceAll(client.getId().toString(), client.getFullName());
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {
        App app = new App();
        app.client = new Client();
        app.eventLogger = new ConsoleEventLogger();

        app.logEvent("Some event for user 1");
    }

}
