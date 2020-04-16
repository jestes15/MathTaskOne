import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class WriteFile {

    public WriteFile(String getWrite, String getNameOfFile) {
        Scanner sc = new Scanner(System.in);

        String path = System.getProperty("user.dir") + "\\TEST-FILES\\" + getNameOfFile + ".txt";

        try {
            Files.write(Paths.get(path), getWrite.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
