package Day5_String;

import java.util.Scanner;

public class SplitComparison {

    public static String[] splitWords(String str) {
        str += " ";
        String word = "";
        int count = 0;
        String[] temp = new String[100];
        for (int i = 0;; i++) {
            try {
                char ch = str.charAt(i);
                if (ch == ' ') {
                    if (!word.isEmpty()) {
                        temp[count++] = word;
                        word = "";
                    }
                } else {
                    word += ch;
                }
            } catch (Exception e) {
                break;
            }
        }
        String[] words = new String[count];
        System.arraycopy(temp, 0, words, 0, count);
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] builtInSplit = input.split(" ");
        String[] customSplit = splitWords(input);
        System.out.println("Are both splits equal: " + compareArrays(builtInSplit, customSplit));
    }
}
