package Day5_String;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }

    public static int[] countVC(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0;; i++) {
            try {
                char ch = str.charAt(i);
                if (Character.isLetter(ch)) {
                    if (isVowel(ch)) vowels++;
                    else consonants++;
                }
            } catch (Exception e) {
                break;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] result = countVC(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
