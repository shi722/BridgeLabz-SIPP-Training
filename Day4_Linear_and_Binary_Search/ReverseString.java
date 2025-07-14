package Day4_Linear_and_Binary_Search;

 public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
    }
}
