package good_implementation.thread_safe_logger;

public class Logger {
    private static Logger logger = null;

    // Private constructor to prevent external instantiation
    private Logger(){}

    public static Logger getLoggerInstance() {
        if (logger == null) { // First check (no synchronization needed here)
            synchronized (Logger.class) { // Synchronize only when creating the instance
                if (logger == null) { // Second check (inside synchronized block)
                    logger = new Logger(); // Create the instance if it's still null
                }
            }
        }
        return logger; // Return the single instance
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
