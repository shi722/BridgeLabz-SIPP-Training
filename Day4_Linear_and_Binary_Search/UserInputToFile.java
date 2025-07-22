package Day4_Linear_and_Binary_Search;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));
        String line;
        while (!(line = input.readLine()).equalsIgnoreCase("exit")) {
            output.write(line);
            output.newLine();
        }
        output.close();
    }
}

