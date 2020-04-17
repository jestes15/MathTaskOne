import java.io.*;
import java.util.Scanner;

public class WriteFile {

    public WriteFile(String getWrite, String getDirectory, String getNameOfFile) {
        Scanner sc = new Scanner(System.in);

        String path = System.getProperty("user.dir") + getDirectory + getNameOfFile + ".txt";

        try {
            FileWriter fw = new FileWriter(path, true);
            fw.write(getWrite);
            fw.close();
            System.out.println("Successfully wrote to " + getNameOfFile + ".txt.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
