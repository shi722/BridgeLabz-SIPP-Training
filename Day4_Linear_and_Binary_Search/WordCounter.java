package Day4_Linear_and_Binary_Search;

import java.io.*;

public class WordCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String line;
        int count = 0;
        String word = "java";
        while ((line = reader.readLine()) != null) {
            for (String w : line.split("\\s+"))
                if (w.equalsIgnoreCase(word)) count++;
        }
        reader.close();
        System.out.println("Count: " + count);
    }
}
