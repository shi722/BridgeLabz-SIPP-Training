package Day2_ControlFlow;

import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt(), power = sc.nextInt();
        int result = 1, i = 0;
        while (i < power) {
            result *= base;
            i++;
        }
        System.out.println("Result: " + result);
    }
}
