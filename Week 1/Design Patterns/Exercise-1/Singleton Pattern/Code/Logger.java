public class Logger {
    // static instance - single copy
    private static Logger instance;

    // private constructor
    private Logger() {
        System.out.println("Logger Initialized.");
    }

    // public method to access the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // create only if not exists
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
