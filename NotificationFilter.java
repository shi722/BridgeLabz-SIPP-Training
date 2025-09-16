import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
                "High BP Alert", "Low Sugar Alert", "Normal Checkup Reminder", "Emergency Alert"
        );

        Predicate<String> emergencyFilter = alert -> alert.contains("Emergency");

        alerts.stream()
              .filter(emergencyFilter)
              .forEach(System.out::println);
    }
}
