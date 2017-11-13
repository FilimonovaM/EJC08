package com.epam.io;

import java.io.FileNotFoundException;

public class CodeReader {

    public static void main(String[] args) throws FileNotFoundException {
        ReaderWriterByte readerWriterByte = new ReaderWriterByte();
        ReaderWriterChar readerWriterChar = new ReaderWriterChar();
        readerWriterByte.read();
        readerWriterChar.read();
    }
}
