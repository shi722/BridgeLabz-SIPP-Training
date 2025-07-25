package Java_Generics;
import java.util.*;

public class UpperBound {
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list)
            System.out.println(num);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        printNumbers(intList);
        printNumbers(doubleList);
    }
}
