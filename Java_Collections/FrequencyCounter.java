package Java_Collections;
import java.util.*;
public class FrequencyCounter {
    public static Map<String, Integer> getFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String item : list) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }
        return freqMap;
    }
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(getFrequency(input));  
    }
}
