package Day2_ControlFlow;

import java.util.Scanner;
public class NaturalNumSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int i = 1, sum = 0;
            while (i <= n) {
                sum += i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);

            if (sum == formulaSum) {
                System.out.println("Both results are correct and match.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
