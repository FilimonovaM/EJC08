package com.epam.io;

import java.io.*;
import java.util.LinkedHashMap;

public class ReaderWriterByte {
    File readFile = new File(".IO_HomeWork_javaCodeForReading.txt");
    File writeFile = new File(".IO_HomeWork_KeyWordsList_byte.txt");
    StringBuffer stringBuffer = new StringBuffer();
    static LinkedHashMap<String, Integer> keyWordsMap = new LinkedHashMap<>();
    CheckKeyWords checkKeyWords;

    ReaderWriterByte() {
        readFile = new File(".IO_HomeWork_javaCodeForReading.txt");
        writeFile = new File(".IO_HomeWork_KeyWordsList_char.txt");
        stringBuffer = new StringBuffer();
        keyWordsMap = new LinkedHashMap<>();
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
                        checkKeyWords.compareWords(stringBuffer.toString());
                        stringBuffer.setLength(0);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(keyWordsMap!=null){
            System.out.println("byte : "+keyWordsMap.toString());
            write();
        }
    }

    public void write() throws FileNotFoundException {
        keyWordsMap.forEach((keyword, amount) -> {
            stringBuffer.append(keyword + " = " + amount + "\n");
        });
        try (FileOutputStream fileOutputStream = new FileOutputStream(writeFile)) {
            fileOutputStream.write(stringBuffer.toString().getBytes());
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
