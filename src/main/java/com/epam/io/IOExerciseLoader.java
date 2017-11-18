package com.epam.io;

import com.epam.io.exercises.keywords.first.ReaderWriterByte;
import com.epam.io.exercises.keywords.second.ReaderWriterChar;
import com.epam.io.exercises.charset.RewriteToChangeEncoding;
import com.epam.io.exercises.keywords.interfaces.ReaderWriter;

import java.io.IOException;

public class IOExerciseLoader {

    /*
    * uses for loading application.
    * */
    public static void main(String[] args) throws IOException {
        //1 exercise
        ReaderWriter readerWriterByte = new ReaderWriterByte();
        readerWriterByte.read();
        //2 exercise
        ReaderWriter readerWriterChar = new ReaderWriterChar();
        readerWriterChar.read();
        //3 exercise
        RewriteToChangeEncoding rewriteToChangeEncoding = new RewriteToChangeEncoding();
        rewriteToChangeEncoding.readUTF8();
        //4 exercise

    }
}
