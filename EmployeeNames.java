import java.util.*;

public class EmployeeNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arjun", "Meera", "Shivanshu");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
