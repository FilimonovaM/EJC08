package com.epam.vol2.io.exercises.keywords.interfaces;

import java.io.FileNotFoundException;

public interface ReaderWriter {
    void read() throws FileNotFoundException;

    void write() throws FileNotFoundException;
}
