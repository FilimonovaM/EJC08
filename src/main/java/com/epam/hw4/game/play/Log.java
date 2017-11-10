package com.epam.hw4.game.play;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;

public class Log {
    GregorianCalendar gregorianCalendar;
    File file;
    StringBuffer stringBuffer;

    private Log() {
        stringBuffer = new StringBuffer();
        file = new File(".casinoLog.txt");
    }

    private static final Log ourInstance = new Log();

    public static Log getInstance() {
        return ourInstance;
    }

    public void logTheEvent(String message) throws IOException {
        gregorianCalendar = new GregorianCalendar();
        stringBuffer.append(gregorianCalendar.getTime() + " | " + message + "\n");
    }

    public void closeTheLog() throws IOException {
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(stringBuffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
