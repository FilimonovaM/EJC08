package com.epam.vol2.jdbc.ex2.procedures;

import com.epam.vol2.jdbc.ex2.dao.LibDao;
import com.epam.vol2.jdbc.ex2.entity.Lib;
import com.epam.vol2.jdbc.ex2.service.LibService;

import java.util.ArrayList;
import java.util.List;

public class DBOptions {
    LibDao libDao = new LibService();
    Lib lib;
    List<Lib> libList;

    /**
     * uses for creating a new table in DB.
     */
    public String createDB() {
        return libDao.createTable();
    }

    /**
     * uses for adding a new line to DB.
     *
     * @param index  - value for column INDEX of DB.
     * @param title  - value for column TITLE of DB.
     * @param author - value for column AUTHOR of DB.
     */
    public void addNewLine(int index, String title, String author) {
        lib = new Lib();
        lib.setId(index);
        lib.setTitle(title);
        lib.setAuthor(author);
        libDao.add(lib);
    }

    /**
     * uses for updating info in DB.
     *
     * @param index  - value for column INDEX of DB.
     * @param title  - value for column TITLE of DB.
     * @param author - value for column AUTHOR of DB.
     */
    public void updateInfo(int index, String title, String author) {
        lib = new Lib();
        lib.setId(index);
        lib.setTitle(title);
        lib.setAuthor(author);
        libDao.update(lib);
    }

    /**
     * uses for showing all the lines from DB.
     */
    public void showAllInfo() {
        libList = new ArrayList<>();
        libList.addAll(libDao.getAll());
        libList.forEach(lib1 -> System.out.println(lib1));
    }

    /**
     * uses for showing someone line from DB.
     *
     * @param index - value for column INDEX of DB.
     */
    public void showByIndex(int index) {
        lib = libDao.getById(index);
        System.out.println(lib.getId() + " - " + lib.getTitle() + " - " + lib.getAuthor());
    }

    /**
     * uses for removing some line from DB.
     *
     * @param id - value for column INDEX of DB.
     */
    public void removeLine(int id) {
        lib = new Lib();
        lib.setId(id);
        libDao.remove(lib);
    }

    /**
     * uses for deleting table.
     */
    public void delete() {
        libDao.deleteTable();
    }
}
