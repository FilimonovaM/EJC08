package com.epam.io;

import java.io.IOException;

public class CodeReader {

    /*
    * uses for loading application.
    * */
    public static void main(String[] args) throws IOException {
        //1 exercise
        ReaderWriterByte readerWriterByte = new ReaderWriterByte();
        readerWriterByte.read();
        //2 exercise
        ReaderWriterChar readerWriterChar = new ReaderWriterChar();
        readerWriterChar.read();
        //3 exercise
        RewriteToChangeEncoding rewriteToChangeEncoding = new RewriteToChangeEncoding();
        rewriteToChangeEncoding.readUTF8();
    }
}
