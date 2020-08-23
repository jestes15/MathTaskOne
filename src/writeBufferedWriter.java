import java.io.*;

class writeBufferedWriter {

    public writeBufferedWriter(String data, String getDirectory, String getFileName) throws IOException {

        String errorPath = System.getProperty("user.dir") + "\\ERROR-CACHE\\ERROR-1.txt";
        String path = System.getProperty("user.dir") + getDirectory + getFileName + ".txt";
        File file = new File(path);
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        try {

            br.newLine();
            br.write(data + "\r\n");
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
            FileWriter fw = new FileWriter(errorPath, true);
            fw.write(String.valueOf(e));
            fw.close();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
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
