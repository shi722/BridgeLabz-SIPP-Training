package Day5_String;
import java.util.*;
public class ReturnAllCharactersAndCompare {
    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] userArray = getCharacters(text);
        char[] builtinArray = text.toCharArray();

        System.out.println("User-defined array: " + new String(userArray));
        System.out.println("Built-in toCharArray: " + new String(builtinArray));

        boolean result = compareCharArrays(userArray, builtinArray);
        System.out.println("Are both arrays equal? " + result);
    }
}
