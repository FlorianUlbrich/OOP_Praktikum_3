import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Returns content of HTML file as String.
 */
class MyFileReader {

    /**
     * Constructor.
     */
    MyFileReader() {}

    /**
     * Returns content of HTML file as String.
     * @param filePath Path to HTMl file.
     * @return String with content of HTML file.
     */
    String readHtmlFile(String filePath) {
        try{
            if(null != filePath && filePath.length() > 5 && filePath.endsWith(".html")) {
                StringBuilder stringBuilder = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line).append("\n");
                }
                return stringBuilder.toString();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("HTML document was empty");
    }
}