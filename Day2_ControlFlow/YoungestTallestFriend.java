package Day2_ControlFlow;

import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        float[] heights = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextFloat();
        }

        int minAge = ages[0];
        float maxHeight = heights[0];
        String youngest = names[0];
        String tallest = names[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }

        System.out.println("Youngest: " + youngest + " (" + minAge + " years)");
        System.out.println("Tallest: " + tallest + " (" + maxHeight + " cm)");
    }
}
