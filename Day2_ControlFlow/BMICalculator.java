package Day2_ControlFlow;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100;

        double bmi = weight / (heightM * heightM);
        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}
