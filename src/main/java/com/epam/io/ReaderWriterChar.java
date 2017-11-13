package com.epam.io;

import java.io.*;
import java.util.LinkedHashMap;

public class ReaderWriterChar {
    File readFile;
    File writeFile;
    StringBuffer stringBuffer;
    LinkedHashMap<String, Integer> keyWordsMapByChar;
    CheckKeyWords checkKeyWords;

    ReaderWriterChar() {
        readFile = new File(".IO_HomeWork_javaCodeForReading.txt");
        writeFile = new File(".IO_HomeWork_KeyWordsList_char.txt");
        stringBuffer = new StringBuffer();
        keyWordsMapByChar = new LinkedHashMap<>();
    }

    public void read() throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader
                (new FileInputStream(readFile), "UTF-8"))) {
            int ch = 0;
            checkKeyWords = new CheckKeyWords();
            while (ch != -1) {
                ch = reader.read();
                if ((char) ch >= 'a' && (char) ch <= 'z') {
                    stringBuffer.append((char) ch);
                } else {
                    if (stringBuffer != null) {
                        checkKeyWords.compareWords(stringBuffer.toString(), keyWordsMapByChar);
                        stringBuffer.setLength(0);
                    }
                }
            }
            System.out.println(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (keyWordsMapByChar != null) {
            System.out.println("char : " + keyWordsMapByChar.toString());
            write();
        }
    }

    public void write() throws FileNotFoundException {
        keyWordsMapByChar.forEach((keyword, amount) -> {
            stringBuffer.append(keyword + " = " + amount + "\n");
        });
        try (BufferedWriter fileWriter = new BufferedWriter
                (new OutputStreamWriter(new FileOutputStream(writeFile), "UTF-16"))) {
            fileWriter.write(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
