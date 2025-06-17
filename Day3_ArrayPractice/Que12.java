package Day3_ArrayPractice;

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3]; 
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; ) {
            System.out.println("Enter marks for student " + (i + 1));
            boolean valid = true;
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) valid = false;
            }
            if (!valid) {
                System.out.println("Negative marks entered. Try again.");
                continue;
            }
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 40) grade[i] = 'D';
            else grade[i] = 'F';

            i++;
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d -> Marks: %d %d %d | %%: %.2f | Grade: %c%n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percent[i], grade[i]);
        }
    }
}
