package com.epam.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class RewriteToChangeEncoding {
    File fileUTF8;
    File fileUTF16;
    StringBuffer stringBuffer;
    RandomAccessFile writer;
    ArrayList arrayList;

    protected RewriteToChangeEncoding() {
        fileUTF8 = new File("src/main/java/com/epam/io/files/", "textUTF-8.txt");
        fileUTF16 = new File("src/main/java/com/epam/io/files/", "textUTF-16.txt");
        stringBuffer = new StringBuffer();
    }

    public void readUTF8() throws IOException {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(fileUTF8, "r")) {
            while (randomAccessFile.getFilePointer() < randomAccessFile.length() - 1) {
                stringBuffer.append(new String((randomAccessFile.readLine() + "\n")
                        .getBytes("ISO-8859-1"), "UTF-8"));
            }
            writeUTF16(stringBuffer);
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeUTF16(StringBuffer text) throws UnsupportedEncodingException {
        try {
            writer = new RandomAccessFile(fileUTF16, "rw");
            byte bytes[] = text.toString().getBytes("UTF-16");
            for (int i : bytes) {
                writer.write((char)i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
