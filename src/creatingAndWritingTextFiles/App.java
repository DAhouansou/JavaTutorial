package creatingAndWritingTextFiles;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("text.txt");

        try(BufferedWriter br = new BufferedWriter(new FileWriter(file));) {
            br.write("This is line one");
            br.newLine();
            br.write("This is line two");
            br.newLine();
            br.write("This the last line");
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }

    }
}
