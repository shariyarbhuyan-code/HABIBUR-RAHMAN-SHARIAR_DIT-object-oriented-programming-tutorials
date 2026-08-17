package week10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void main(String[] args) {
        try {
            File file = new File("summary.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }
            FileWriter writer = new FileWriter("summary.txt");
            writer.write("OOP Lab Tutorials completed successfully.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
