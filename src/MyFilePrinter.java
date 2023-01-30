import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Prints String with output to a file.
 */
class MyFilePrinter {

    /**
     * Raw text without HTML.
     */
    private String output;

    /**
     * Name of the file in which the text is supposed to be saved.
     */
    private String newFileName;

    /**
     * Constructor.
     * @param fileName Path of output and file name.
     * @param output Output String.
     */
    MyFilePrinter(String fileName, String output) {
        this.output = output;
        this.newFileName = fileName;
    }

    /**
     * Prints String with output to a file.
     */
    void saveAsFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFileName));
            bufferedWriter.write(output);
            bufferedWriter.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}