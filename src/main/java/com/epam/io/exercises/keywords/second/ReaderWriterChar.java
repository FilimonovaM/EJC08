package com.epam.io.exercises.keywords.second;

import com.epam.io.exercises.keywords.CheckKeyWords;
import com.epam.io.exercises.keywords.interfaces.ReaderWriter;

import java.io.*;
import java.util.LinkedHashMap;

public class ReaderWriterChar implements ReaderWriter {
    File readFile;
    File writeFile;
    StringBuffer stringBuffer;
    LinkedHashMap<String, Integer> keyWordsMapByChar;
    CheckKeyWords checkKeyWords;

    public ReaderWriterChar() {
        readFile = new File("src/main/java/com/epam/io/files/", "IO_HomeWork_javaCodeForReading.txt");
        writeFile = new File("src/main/java/com/epam/io/files/", "IO_HomeWork_KeyWordsList_char.txt");
        stringBuffer = new StringBuffer();
        keyWordsMapByChar = new LinkedHashMap<>();
    }

    /**
     * uses for reading in charset - UTF-8.
     */
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

    /**
     * uses for writing key words & some information to another file in charset - UTF-16.
     */
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
