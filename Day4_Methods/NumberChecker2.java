public class NumberChecker2 {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int sumDigits(int[] d) {
        int sum = 0;
        for (int v : d) sum += v;
        return sum;
    }

    public static int sumSquareDigits(int[] d) {
        int sum = 0;
        for (int v : d) sum += Math.pow(v, 2);
        return sum;
    }

    public static boolean isHarshad(int n) {
        int[] d = getDigits(n);
        return n % sumDigits(d) == 0;
    }

    public static int[][] digitFrequency(int n) {
        int[] d = getDigits(n);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int value : d) freq[value][1]++;
        return freq;
    }
}
