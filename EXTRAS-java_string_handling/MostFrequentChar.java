public class MostFrequentChar {
    public static char mostFrequent(String str) {
        int[] count = new int[256];
        for (char c : str.toCharArray()) {
            count[c]++;
        }
        int max = 0;
        char res = ' ';
        for (char c : str.toCharArray()) {
            if (count[c] > max) {
                max = count[c];
                res = c;
            }
        }
        return res;
    }
}
