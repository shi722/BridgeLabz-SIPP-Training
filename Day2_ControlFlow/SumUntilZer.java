package Day2_ControlFlow;
import java.util.Scanner;
public class SumUntilZer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }
            total += num;
        }

        System.out.println("Total sum is: " + total);
    }
}
