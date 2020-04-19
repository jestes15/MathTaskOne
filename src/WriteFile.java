import java.io.*;

public class WriteFile {

    public WriteFile(String getWrite, String getDirectory, String getNameOfFile) throws IOException {

        String path = System.getProperty("user.dir") + getDirectory + getNameOfFile + ".txt";
        String errorPath = System.getProperty("user.dir") + "\\ERROR-CACHE\\ERROR-1.txt";

        try {
            FileWriter fw = new FileWriter(path, true);
            fw.write(getWrite);
            fw.close();
            System.out.println("Successfully wrote to " + getNameOfFile + ".txt.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

            FileWriter fw = new FileWriter(errorPath, true); //Writes the error code to the error cache file
            fw.write(String.valueOf(e));
            fw.close();
        }
    }
}
