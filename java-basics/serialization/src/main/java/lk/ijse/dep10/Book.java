package lk.ijse.dep10;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        System.out.println("Book()");
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
