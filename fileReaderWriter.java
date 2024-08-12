//Explain file io using character stream with appropriate example.
// hint: use FileReader, FileWriter
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReaderWriter{
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // FileReader to read from the source file
        try (FileReader fr = new FileReader(sourceFile);
             // FileWriter to write to the destination file
             FileWriter fw = new FileWriter(destinationFile)) {

            int charRead;
            // Read character by character from the source file
            while ((charRead = fr.read()) != -1) {
                // Write character by character to the destination file
                fw.write(charRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
