package Day4_Linear_and_Binary_Search;

import java.util.HashSet;
public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "programming";
        String result = removeDuplicates(str);
        System.out.println("Without duplicates: " + result);
    }
}
