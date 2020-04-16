import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class WriteFile {

    public WriteFile(String getWrite, String getNameOfFile) {
        Scanner sc = new Scanner(System.in);

        String path = System.getProperty("user.dir") + "\\TEST-FILES\\" + getNameOfFile + ".txt";

        try {
            FileWriter fw = new FileWriter(path, true);
            fw.write(getWrite);
            fw.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
