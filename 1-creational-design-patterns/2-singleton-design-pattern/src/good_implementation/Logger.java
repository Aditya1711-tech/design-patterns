package good_implementation;

public class Logger {
    private static Logger logger = null;

    // Private constructor to prevent external instantiation
    private Logger() {}

    public static Logger getLoggerInstance(){
        if(logger == null){
            logger = new Logger(); // New instance only if one doesn't exist
        }
        return logger;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
