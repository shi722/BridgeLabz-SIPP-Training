package Java_Streams;
import java.io.*;

public class FileCopyUsingStreams {
    public static void main(String[] args) {
        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");

        if (!sourceFile.exists()) {
            System.out.println("❌ Source file does not exist.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully using FileInputStream and FileOutputStream.");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
