public class RemoveChar {
    public static String removeCharacter(String str, char ch) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (c != ch)
                result += c;
        }
        return result;
    }
}
