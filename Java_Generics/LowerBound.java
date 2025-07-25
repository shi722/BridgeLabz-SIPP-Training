package Java_Generics;
import java.util.*;

public class LowerBound {
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);
        System.out.println(numberList);
    }
}
