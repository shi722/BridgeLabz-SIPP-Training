package Java_Constructors.Level_1;

public class Book1 {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book1(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Borrowed: " + title);
        } else {
            System.out.println("Book already borrowed.");
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        Book1 book = new Book1("Java Basics", "James Gosling", 450.0, true);
        book.display();
        book.borrowBook();
        book.borrowBook();
        book.display();
    }
}
