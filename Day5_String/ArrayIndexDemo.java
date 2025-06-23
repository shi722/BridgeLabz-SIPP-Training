import java.util.Scanner;
public class ArrayIndexDemo {

    static void generateException(String[] names) {
        System.out.println("Accessing 10th element: " + names[10]);
    }

    static void handleException(String[] names) {
        try {
            System.out.println("Accessing 10th element: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < 5; i++) {
            names[i] = sc.next();
        }
        handleException(names);
    }
}
