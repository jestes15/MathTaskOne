import java.io.*;

public class CreateFile {

    public CreateFile(String getName, String getDir) throws IOException {
        String errorPath = System.getProperty("user.dir") + "\\ERROR-CACHE\\ERROR-1.txt";
        try {
            File myOBJ = new File(System.getProperty("user.dir") + getDir + getName + ".txt");
            if (myOBJ.createNewFile()) {
                System.out.println("File Created: " +  myOBJ.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();

            FileWriter fw = new FileWriter(errorPath, true); //Writes the error code to the error cache file
            fw.write(String.valueOf(e));
            fw.close();
        }
    }
}
