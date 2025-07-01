package Object_Oriented_Design_Principles.Object_Modeling.Assisted_Problems;

import java.util.*;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }
}