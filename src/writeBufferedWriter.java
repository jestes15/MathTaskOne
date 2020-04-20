import java.io.*;

class writeBufferedWriter {

    public writeBufferedWriter(String data, int numberOfLines) throws IOException {

        String path = System.getProperty("user.dir") + "\\TEST-FILES\\TEST-4.txt";
        File file = new File(path);
        String dataWithNewLine = data + System.getProperty("line.separator");
        String errorPath = System.getProperty("user.dir") + "\\ERROR-CACHE\\ERROR-1.txt";
        FileWriter fr = new FileWriter(file);
        BufferedWriter br = new BufferedWriter(fr);
        try {
            for (int i = numberOfLines; i > 0; i--) {
                br.write(dataWithNewLine);
            }
        }
        catch (IOException e) {
            e.printStackTrace();

            FileWriter fw = new FileWriter(errorPath, true);
            fw.write(String.valueOf(e));
            fw.close();
        }
        finally {
            try {
                br.close();
                fr.close();
            }
            catch (IOException e) {
                e.printStackTrace();

                FileWriter fw = new FileWriter(errorPath, true);
                fw.write(String.valueOf(e));
                fw.close();
            }
        }

    }
}
