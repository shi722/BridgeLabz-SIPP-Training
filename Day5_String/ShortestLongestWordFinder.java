package Day5_String;

import java.util.Scanner;

public class ShortestLongestWordFinder {

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

    public static String[] findMinMaxWords(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (stringLength(word) < stringLength(shortest)) shortest = word;
            if (stringLength(word) > stringLength(longest)) longest = word;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[] result = findMinMaxWords(words);
        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}
