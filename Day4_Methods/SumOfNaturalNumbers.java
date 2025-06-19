import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number (n > 0): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number greater than 0.");
            return;
        }

        int sumByRecursion = recursiveSum(n);
        int sumByFormula = formulaSum(n);

        System.out.println("Sum using recursion: " + sumByRecursion);
        System.out.println("Sum using formula:   " + sumByFormula);

        if (sumByRecursion == sumByFormula) {
