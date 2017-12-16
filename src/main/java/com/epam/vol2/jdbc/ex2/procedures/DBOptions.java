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

    public String createDB() {
        return libDao.createTable();
    }

    public void addNewLine(int index, String title, String author) {
        lib = new Lib();
        lib.setId(index);
        lib.setTitle(title);
        lib.setAuthor(author);
        libDao.add(lib);
    }

    public void updateInfo(int index, String title, String author) {
        lib = new Lib();
        lib.setId(index);
        lib.setTitle(title);
        lib.setAuthor(author);
        libDao.update(lib);
    }

    public void showAllInfo() {
        libList = new ArrayList<>();
        libList.addAll(libDao.getAll());
        libList.forEach(lib1 -> System.out.println(lib1));
    }

    public void showByIndex(int index) {
        lib = libDao.getById(index);
        System.out.println(lib.getId()+" - "+lib.getTitle()+" - "+lib.getAuthor());
    }
    public void removeLine(int id){
        lib = new Lib();
        lib.setId(id);
        libDao.remove(lib);
    }
    public void delete(){
        libDao.deleteTable();
    }
}
