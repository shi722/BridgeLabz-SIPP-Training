import java.util.Scanner;

public class PowerCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double exponent = input.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Power: " + result);
    }
}
