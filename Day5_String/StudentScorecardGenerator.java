package Day5_String;

import java.util.Random;

public class StudentScorecardGenerator {

    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rand.nextInt(41) + 60;
            }
        }
        return marks;
    }

    public static double[][] calculatePerformance(int[][] marks) {
        int students = marks.length;
        double[][] performance = new double[students][3];
        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            performance[i][0] = total;
            performance[i][1] = Math.round(average * 100.0) / 100.0;
            performance[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return performance;
    }

    public static String[] assignGrades(double[][] performance) {
        String[] grades = new String[performance.length];
        for (int i = 0; i < performance.length; i++) {
            double percent = performance[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] marks, double[][] performance, String[] grades) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t\t%\t\tGrade");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t%.2f\t%s\n",
                (i + 1),
                marks[i][0], marks[i][1], marks[i][2],
                (int) performance[i][0],
                performance[i][1],
                performance[i][2],
                grades[i]
            );
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5;
        int[][] marks = generateMarks(numberOfStudents);
        double[][] performance = calculatePerformance(marks);
        String[] grades = assignGrades(performance);
        displayScorecard(marks, performance, grades);
    }
}
