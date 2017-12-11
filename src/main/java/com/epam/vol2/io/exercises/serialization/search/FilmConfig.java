package com.epam.vol2.io.exercises.serialization.search;

import com.epam.vol2.io.exercises.serialization.interfaces.Film;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilmConfig implements Serializable {
    Validator validator = new Validator();
    List<Film> filmList = new ArrayList();
    File file;
    String actorName;
    StringBuffer stringBuffer;
    static final String PATH = "src/main/java/com/epam/vol2/io/exercises/serialization/saved";

    public FilmConfig(Film... films) {
        for (Film s : films) {
            filmList.add(s);
        }
    }

    /**
    * uses for serializing.
    *
    * @param actorName - is a chosen name of actor
    */
    public void serialize(String actorName) throws IOException {
        this.actorName = actorName;
        try {
            file = new File(PATH, actorName.concat(".txt"));
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        stringBuffer = new StringBuffer();
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            for (Film f : filmList) {
                if (validator.isValid(f.getActors(), actorName)) {
                    stringBuffer.append(f.getFilmName() + "\n");
                }
            }
            objectOutputStream.writeObject(stringBuffer);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * uses for getting of the list with films.
     *
     */
    public void deserialize() {
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            if (filmList != null) {
                System.out.printf("Actor %s founded in:%n%s", actorName,
                        objectInputStream.readObject().toString());
            } else {
                System.out.printf("We have not %s in this base%n", actorName);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
