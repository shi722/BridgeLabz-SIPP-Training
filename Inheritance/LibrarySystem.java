package Inheritance;

public class LibrarySystem {
    public static void main(String[] args) {
        Author author = new Author("Clean Code", 2008, "Robert C. Martin", "Known as 'Uncle Bob', he is a pioneer in clean coding practices.");
        author.displayInfo();
    }
}

class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}
