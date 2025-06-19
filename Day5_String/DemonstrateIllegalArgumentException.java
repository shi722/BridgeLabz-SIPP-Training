package Day5_String;

import java.util.Scanner;

public class DemonstrateIllegalArgumentException {
    public static void generateException(String text) {
        String error= text.substring(5, 2);
    }

    public static void handleException(String text) {
        try {
            String error= text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleException(text);
    }
}

