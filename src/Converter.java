import java.util.Scanner;

/**
 * Manages file input and output, calls Converter for removing HTML tags.
 */
class Converter {

    /**
     * Manages file input and output, calls TagFilter for removing HTML tags.
     */
    void convert() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the file path."); // "/Users/florian/Desktop/document.html";
        String filePath = scanner.nextLine();
        System.out.println("Please enter the output file name");
        String newFileName = scanner.nextLine();

        MyFileReader myFileReader = new MyFileReader();
        String rawText = myFileReader.readHtmlFile(filePath);
        TagFilter tagFilter = new TagFilter();
        String output = tagFilter.removeTags(rawText);
        System.out.println(output);

        MyFilePrinter myFilePrinter = new MyFilePrinter(newFileName, output);
        myFilePrinter.saveAsFile();
    }
}