package Day4_Linear_and_Binary_Search;

public class SearchSentence {
    public static String findSentence(String[] sentences, String word) {
        for (String s : sentences)
            if (s.contains(word)) return s;
        return "Not Found";
    }
}
