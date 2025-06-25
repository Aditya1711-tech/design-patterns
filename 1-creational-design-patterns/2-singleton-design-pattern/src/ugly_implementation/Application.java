package ugly_implementation;

public class Application {
    public void run() {
        Logger logger = new Logger();  // New instance created every time
        logger.log("Application started.");
    }
}
