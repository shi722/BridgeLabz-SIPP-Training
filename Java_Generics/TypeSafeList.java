package Java_Generics;
import java.util.*;
public  class TypeSafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        String str = list.get(0);
        System.out.println(str);
    }
}
