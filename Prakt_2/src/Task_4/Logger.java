package Task_4;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private FileWriter fileWriter;

    private Logger() {
        try {
            fileWriter = new FileWriter("log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        try {
            System.out.println(message); // Console output
            fileWriter.write(message + "\n"); // Write to file
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
