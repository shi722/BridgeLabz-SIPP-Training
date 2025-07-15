package Day1_LinkedList;

class Movie {
    String title, director;
    int year;
    double rating;
    Movie next, prev;

    Movie(String t, String d, int y, double r) {
        title = t; director = d; year = y; rating = r;
    }
}

public class MovieManagementSystem {
    Movie head = null, tail = null;

    void addAtBeginning(String t, String d, int y, double r) {
        Movie m = new Movie(t, d, y, r);
        if (head == null) head = tail = m;
        else {
            m.next = head;
            head.prev = m;
            head = m;
        }
    }

    void addAtEnd(String t, String d, int y, double r) {
        Movie m = new Movie(t, d, y, r);
        if (tail == null) head = tail = m;
        else {
            tail.next = m;
            m.prev = tail;
            tail = m;
        }
    }

    void addAtPosition(String t, String d, int y, double r, int pos) {
        if (pos <= 1 || head == null) { addAtBeginning(t, d, y, r); return; }
        Movie temp = head; int i = 1;
        while (temp.next != null && i < pos - 1) { temp = temp.next; i++; }
        if (temp.next == null) { addAtEnd(t, d, y, r); return; }
        Movie m = new Movie(t, d, y, r);
        m.next = temp.next;
        m.prev = temp;
        temp.next.prev = m;
        temp.next = m;
    }

    void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) head = head.next;
                if (temp == tail) tail = tail.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void searchByDirector(String d) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(d))
                System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    void searchByRating(double r) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == r)
                System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }

    void updateRating(String title, double newR) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newR;
                return;
            }
            temp = temp.next;
        }
    }
}
