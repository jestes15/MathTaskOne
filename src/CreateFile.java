import java.io.*;

public class CreateFile {

    public CreateFile(String getName) {
        try {
            File myOBJ = new File("C:\\Users\\The Estes Family\\IdeaProjects\\MathTaskOne\\TEST-FILES\\" + getName + ".txt");
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
