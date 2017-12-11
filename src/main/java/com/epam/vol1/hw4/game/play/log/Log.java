package com.epam.vol1.hw4.game.play.log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class Log {
    File file;
    StringBuffer stringBuffer;
    Formatter formatter;
    Date date;

    private Log() {
        stringBuffer = new StringBuffer();
        formatter = new Formatter(stringBuffer, Locale.US);
        file = new File("src/main/java/com/epam/vol1/hw4/game/play/log/","casinoLog.txt");
    }

    private static final Log ourInstance = new Log();

    /**
     * uses for getting the instance of this class.
     *
     * @return instance
     */
    public static Log getInstance() {
        return ourInstance;
    }

    /**
     * uses for buffering of the logs.
     *
     * @param message - message about the events(some exceptions, player`s moving, balance changes)
     */
    public void logTheEvent(String message) throws IOException {
        date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd'-'MM'-'yyyy':'hh'-'mm'-'ss");
        formatter.format("%s-%s;\n", simpleDateFormat.format(date).toString(), message);
    }

    /**
     * uses for writing the logs to the file casinoLog.txt in the root folder.
     */
    public void closeTheLog() throws IOException {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(stringBuffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
