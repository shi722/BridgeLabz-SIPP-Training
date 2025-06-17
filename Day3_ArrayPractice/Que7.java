package Day3_ArrayPractice;
import java.util.Scanner;
public class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        for (int i = 0; i < 10; ) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double y = sc.nextDouble();
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input, enter again.");
                continue;
            }
            salary[i] = s;
            years[i] = y;
            i++;
        }

        for (int i = 0; i < 10; i++) {
            bonus[i] = years[i] > 5 ? 0.05 * salary[i] : 0.02 * salary[i];
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("\nTotal Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
    }
}
