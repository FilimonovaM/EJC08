package com.epam.io;

import java.io.*;
import java.util.LinkedHashMap;

public class ReaderWriterByte {
    File readFile;
    File writeFile;
    StringBuffer stringBuffer;
    LinkedHashMap<String, Integer> keyWordsMapByByte;
    CheckKeyWords checkKeyWords;

    ReaderWriterByte() {
        readFile = new File(".IO_HomeWork_javaCodeForReading.txt");
        writeFile = new File(".IO_HomeWork_KeyWordsList_byte.txt");
        stringBuffer = new StringBuffer();
        keyWordsMapByByte = new LinkedHashMap<>();
    }

    public void read() throws FileNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(readFile)) {
            int i = 1;
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
