package Day2_ControlFlow;

import java.util.Scanner;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            int i = 1;
            while (number * i < 100) {
                System.out.println(number * i);
                i++;
            }
        } else {
            System.out.println("Enter a positive number less than 100.");
        }
    }
}
