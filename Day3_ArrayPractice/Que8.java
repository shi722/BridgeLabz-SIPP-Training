package Day3_ArrayPractice;

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; ) {
            System.out.print("Enter weight (kg): ");
            double w = sc.nextDouble();
            System.out.print("Enter height (m): ");
            double h = sc.nextDouble();
            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input, enter again.");
                continue;
            }
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);

            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
            i++;
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Height: %.2f, Weight: %.2f, BMI: %.2f, Status: %s%n",
                    i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
