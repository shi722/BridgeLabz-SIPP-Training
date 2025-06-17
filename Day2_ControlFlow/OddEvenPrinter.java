package Day2_ControlFlow;

import java.util.Scanner;
public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is even");
                else
                    System.out.println(i + " is odd");
            }
        } else {
            System.out.println("Enter a natural number.");
        }
    }
}

