import java.io.*;

public class CreateFile {

    public CreateFile(String getName, String getDir) {
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
        }
    }
}
