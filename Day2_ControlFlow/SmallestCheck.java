package Day2_ControlFlow;
import java.util.Scanner;
public class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        System.out.println("Is the first number the smallest? " + (n1 < n2 && n1 < n3));
    }
}

