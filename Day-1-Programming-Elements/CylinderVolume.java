import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double height = input.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume: " + volume);
    }
}
