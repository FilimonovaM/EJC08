package com.epam.vol2.io;

import com.epam.vol2.io.exercises.charset.RewriteAndChangeEncoding;
import com.epam.vol2.io.exercises.keywords.first.ReaderWriterByte;
import com.epam.vol2.io.exercises.keywords.interfaces.ReaderWriter;
import com.epam.vol2.io.exercises.keywords.second.ReaderWriterChar;
import com.epam.vol2.io.exercises.serialization.films.DarkShadows;
import com.epam.vol2.io.exercises.serialization.films.GreatExpectation;
import com.epam.vol2.io.exercises.serialization.films.LockStock;
import com.epam.vol2.io.exercises.serialization.search.FilmConfig;

import java.io.IOException;

public class IOExerciseLoader {
    ReaderWriter readerWriterByte = new ReaderWriterByte();
    ReaderWriter readerWriterChar = new ReaderWriterChar();
    RewriteAndChangeEncoding rewriteToChangeEncoding = new RewriteAndChangeEncoding();
    FilmConfig filmConfig = new FilmConfig(new LockStock(),
            new GreatExpectation(), new DarkShadows());

    /*
    * uses to start the application.
    * */
    public static void main(String[] args) throws IOException {
        IOExerciseLoader loader = new IOExerciseLoader();
        loader.runApplication();
    }

    /**
     * uses to run the exercises.
     *
     */
    public void runApplication() throws IOException {
        //1 exercise
        readerWriterByte.read();
        //2 exercise
        readerWriterChar.read();
        //3 exercise
        rewriteToChangeEncoding.readUTF8();
        System.out.println();
        //4 exercise
        // We use a lil bit distorted name"Jason Flemyng" like a default name. Why?
        // Because program can understand the names with a little mistakes
        // Because we haven`t some reasons to give an opportunity for the
        // manual input for the user: there is only 3 films here and little amount of actors.
        filmConfig.serialize("JasFflemyng");
        filmConfig.deserialize();
    }
}
