package Java_Collections;
public class GenericPrinter {
    public static <T> void print(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        print(42);
        print("Java");
        print(3.14);
    }
}

