package Day5_String;

import java.util.Scanner;

public class StringExceptionDemo {

    public static void generateException(String str) {
        System.out.println("Generating exception...");
        char ch = str.charAt(str.length());  
        System.out.println("Character at index: " + ch);
    }

    public static void handleException(String str) {
        System.out.println("Handling exception with try-catch...");
        try {
            char ch = str.charAt(str.length()); 
            System.out.println("Character at index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception in generateException: " + e);
        }

        handleException(input);
    }
}
