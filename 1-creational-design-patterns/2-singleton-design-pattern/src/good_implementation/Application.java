package good_implementation;

public class Application {
    public void run() {
        Logger logger = Logger.getLoggerInstance(); // Always fetch the same instance
        logger.log("Application started.");
    }
}
