package Day5_String;

public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println("Length: " + text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleException();
    }
}
