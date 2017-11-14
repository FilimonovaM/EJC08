package com.epam.io;

import java.io.FileNotFoundException;

/**
 * Created by Admin on 014 14.11.17.
 */
public interface ReaderWriter {
    void read() throws FileNotFoundException;

    void write() throws FileNotFoundException;
}
