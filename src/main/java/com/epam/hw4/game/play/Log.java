package com.epam.hw4.game.play;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Log {
    GregorianCalendar gregorianCalendar;
    File file;
    StringBuffer stringBuffer;
    Formatter formatter;
    Date date;

    private Log() {
        stringBuffer = new StringBuffer();
        formatter = new Formatter(stringBuffer, Locale.US);
        file = new File(".casinoLog.txt");

    }

    private static final Log ourInstance = new Log();

    public static Log getInstance() {
        return ourInstance;
    }

    public void logTheEvent(String message) throws IOException {
        gregorianCalendar = new GregorianCalendar();
        date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd'-'MM'-'yyyy':'hh'-'mm");
        formatter.format("%s-%s;\n",simpleDateFormat.format(date).toString(),message);
//        stringBuffer.append(gregorianCalendar.getTime() + " | " + message + "\n");
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
