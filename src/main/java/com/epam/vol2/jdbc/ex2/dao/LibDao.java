package com.epam.vol2.jdbc.ex2.dao;

import com.epam.vol2.jdbc.ex2.entity.Lib;

import java.util.List;

public interface LibDao {
    String createTable();

    void add(Lib lib);

    List<Lib> getAll();

    Lib getById(int id);

    void update(Lib lib);

    void remove(Lib lib);

    void deleteTable();
}
