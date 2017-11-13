package com.epam.io;

import java.io.*;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;

public class ReaderWriterChar {
    File readFile;
    File writeFile;
    StringBuffer stringBuffer;
    static LinkedHashMap<String, Integer> keyWordsMap;
    CheckKeyWords checkKeyWords;
    public static Charset UTF;

    ReaderWriterChar() {
        readFile = new File(".IO_HomeWork_javaCodeForReading.txt");
        writeFile = new File(".IO_HomeWork_KeyWordsList_char.txt");
        stringBuffer = new StringBuffer();
        keyWordsMap = new LinkedHashMap<>();

    }

    public void read() throws FileNotFoundException {
        UTF = Charset.forName("UTF-8");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader
                (new FileInputStream(readFile),UTF))) {
            int ch = 0;
            checkKeyWords = new CheckKeyWords();
            while (ch != -1) {
                ch = reader.read();
                if ((char) ch >= 'a' && (char) ch <= 'z') {
                    stringBuffer.append((char) ch);
                } else {
                    if (stringBuffer != null) {
                        checkKeyWords.compareWords(stringBuffer.toString());
                        stringBuffer.setLength(0);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(keyWordsMap!=null){
            System.out.println("char : "+keyWordsMap.toString());
            write();
        }
    }

    public void write() throws FileNotFoundException {
        UTF = Charset.forName("UTF-16");
        keyWordsMap.forEach((keyword, amount) -> {
            stringBuffer.append(keyword + " = " + amount + "\n");
        });
        try (BufferedWriter fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(writeFile),UTF))) {
            fileWriter.write(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
