
import java.io.*;

public class bisbos {
    public static void main(String[] args) {
        try {
            // Creating a BufferedInputStream to read from a file
            FileInputStream fileInputStream = new FileInputStream("john.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            // Creating a BufferedOutputStream to write to a file
            FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            // Reading from input file and writing to output file
            int data;
            while ((data = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(data);
            }

            // Closing streams
            bufferedInputStream.close();
            bufferedOutputStream.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}