package Day3_ArrayPractice;

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] digits = new int[10];
        int index = 0;
        while (number != 0) {
            if (index == digits.length) {
                int[] temp = new int[digits.length * 2];
                System.arraycopy(digits, 0, temp, 0, index);
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        int max1 = -1, max2 = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > max1) {
                max2 = max1;
                max1 = digits[i];
            } else if (digits[i] > max2 && digits[i] != max1) {
                max2 = digits[i];
            }
        }

        System.out.println("Largest: " + max1);
        System.out.println("Second Largest: " + (max2 == -1 ? "Not Found" : max2));
    }
}
