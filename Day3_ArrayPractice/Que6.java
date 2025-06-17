package Day3_ArrayPractice;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " is Positive and ");
                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        System.out.println("Comparing first and last element:");
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are Equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is Greater than last.");
        } else {
            System.out.println("First element is Less than last.");
        }
    }
}
