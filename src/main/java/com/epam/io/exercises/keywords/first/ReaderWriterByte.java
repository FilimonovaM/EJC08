package com.epam.io.exercises.keywords.first;

import com.epam.io.exercises.keywords.CheckKeyWords;
import com.epam.io.exercises.keywords.interfaces.ReaderWriter;

import java.io.*;
import java.util.LinkedHashMap;

public class ReaderWriterByte implements ReaderWriter {
    File readFile;
    File writeFile;
    StringBuffer stringBuffer;
    LinkedHashMap<String, Integer> keyWordsMapByByte;
    CheckKeyWords checkKeyWords;

    public ReaderWriterByte() {
        readFile = new File("src/main/java/com/epam/io/files/", "IO_HomeWork_javaCodeForReading.txt");
        writeFile = new File("src/main/java/com/epam/io/files/", "IO_HomeWork_KeyWordsList_byte.txt");
        stringBuffer = new StringBuffer();
        keyWordsMapByByte = new LinkedHashMap<>();
    }

    /**
     * uses for reading from the file(byte stream).
     */
    @Override
    public void read() throws FileNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(readFile)) {
            int i = 0;
            checkKeyWords = new CheckKeyWords();
            while (i != -1) {
                i = fileInputStream.read();
                if ((char) i >= 'a' && (char) i <= 'z') {
                    stringBuffer.append((char) i);
                } else {
                    if (stringBuffer != null) {
                        checkKeyWords.compareWords(stringBuffer.toString(), keyWordsMapByByte);
                        stringBuffer.setLength(0);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (keyWordsMapByByte != null) {
            System.out.println("byte : " + keyWordsMapByByte.toString());
            write();
        }
    }

    /**
     * uses for writing key words & some information to another file.
     */
    @Override
    public void write() throws FileNotFoundException {
        keyWordsMapByByte.forEach((keyword, amount) -> {
            stringBuffer.append(keyword + " = " + amount + "\n");
        });
        try (FileOutputStream fileOutputStream = new FileOutputStream(writeFile)) {
            fileOutputStream.write(stringBuffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
