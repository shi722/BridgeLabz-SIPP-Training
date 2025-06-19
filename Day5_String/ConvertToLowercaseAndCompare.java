package Day5_String;

import java.util.Scanner;
public class ConvertToLowercaseAndCompare {
    public static String toLowerCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String custom = toLowerCustom(input);
        String builtin = input.toLowerCase();
        System.out.println("User-defined lowercase: " + custom);
        System.out.println("Built-in lowercase: " + builtin);
        System.out.println("Are both equal? " + compareStrings(custom, builtin));
    }
}
