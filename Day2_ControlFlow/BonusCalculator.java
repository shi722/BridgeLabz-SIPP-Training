package Day2_ControlFlow;

import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus: ₹" + bonus);
        } else {
            System.out.println("No bonus. Service less than 5 years.");
        }
    }
}
