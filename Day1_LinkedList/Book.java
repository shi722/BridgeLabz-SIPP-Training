package Day1_LinkedList;

public class Book {
    String title, author, genre;
    int bookId;
    boolean isAvailable;
    Book prev, next;

    Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.prev = this.next = null;
    }
}