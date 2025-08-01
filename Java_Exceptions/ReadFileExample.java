package Java_Exceptions;
import java.io.*;
public class ReadFileExample {
    public static void main(String[] args) {
        File file = new File("data.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("File contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close(); 
            fr.close(); 
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
