import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // weight, height, BMI

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);
        String[] bmiStatus = getBMIStatus(data);

        System.out.println("\nResults:");
        System.out.printf("%-10s%-10s%-10s%-15s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f%-10.2f%-10.2f%-15s%n", data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }
    }
}
