package Day5_String;

import java.util.Scanner;

public class StringLengthWithoutBuiltin {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) str.charAt(count++);
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("Custom Length: " + findLength(input));
        System.out.println("Built-in Length: " + input.length());
    }
}

