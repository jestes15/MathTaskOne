import java.io.*;

class writeBufferedWriter {

    public writeBufferedWriter(String data, int numberOfLines, String getDirectory, String getFileName) throws IOException {

        String errorPath = System.getProperty("user.dir") + "\\ERROR-CACHE\\ERROR-1.txt";
        String path = System.getProperty("user.dir") + getDirectory + getFileName + ".txt";

        File file = new File(path);

        String dataWithNewLine = data + System.getProperty("line.separator");

        FileWriter fr = new FileWriter(file);
        BufferedWriter br = new BufferedWriter(fr);
        try {
            for (int i = numberOfLines; i > 0; i--) {
                br.newLine();
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
        System.out.println("PROCESS FINISHED");

    }
    @Override
    public String toString() {
        return "RETURN MESSAGE TEST";
    }
}
