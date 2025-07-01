package Java_Constructors.Access_Modifiers;

public class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayInfo() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSizeMB + "MB");
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("123-456", "Java Programming", "James Gosling", 2.5);
        ebook.displayInfo();
        System.out.println("Author: " + ebook.getAuthor());
        ebook.setAuthor("Joshua Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
