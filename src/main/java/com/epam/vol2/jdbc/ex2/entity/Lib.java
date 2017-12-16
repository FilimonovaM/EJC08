package com.epam.vol2.jdbc.ex2.entity;

/**
 * Class uses to store field values
 */
public class Lib {
    private int id;
    private String title;
    private String author;

    public Lib() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lib lib = (Lib) o;

        if (id != lib.id) return false;
        if (title != null ? !title.equals(lib.title) : lib.title != null) return false;
        return author != null ? author.equals(lib.author) : lib.author == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Lib{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
