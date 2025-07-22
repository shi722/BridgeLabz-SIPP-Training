package Day4_Linear_and_Binary_Search;

import java.io.*;

public class FileReaderLineByLine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String line;
        while ((line = reader.readLine()) != null) System.out.println(line);
        reader.close();
    }
}
