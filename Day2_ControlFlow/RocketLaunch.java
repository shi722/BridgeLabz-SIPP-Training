package Day2_ControlFlow;

import java.util.Scanner;
public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Lift off!");
    }
}
