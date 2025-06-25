package Day5_String;

import java.util.Scanner;

public class WordLength2DArray {
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

    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) str.charAt(count++);
        } catch (Exception e) {}
        return count;
    }

    public static String[][] wordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] table = wordLengths(words);
        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
