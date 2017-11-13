package com.epam.io;

import java.io.IOException;

public class CodeReader {

    public static void main(String[] args) throws IOException {
        ReaderWriterByte readerWriterByte = new ReaderWriterByte();
        ReaderWriterChar readerWriterChar = new ReaderWriterChar();
        RewriteToChangeEncoding rewriteToChangeEncoding = new RewriteToChangeEncoding();
        readerWriterByte.read();
        readerWriterChar.read();
        rewriteToChangeEncoding.readUTF8();
    }
}
