// Describe and demonstrate Binary I/O classes of java
//Explain file io using byte stream with appropriate example.
// hint: use FileInputStream, FileOutputStream

import java.io.*;

public class fileIOStreams {
    public static void main(String[] args) {
        String sourceFile = "john.txt";
        String destinationFile = "Practical1.txt";

        try (FileOutputStream fos = new FileOutputStream(sourceFile)) {
            String content = "This is some content to write into00 john.txt.";
            int number = 22;
            int number1 = 23;

            fos.write(content.getBytes()); // Write the string content as bytes
            fos.write(System.lineSeparator().getBytes()); // Write a newline separator
            fos.write(String.valueOf(number).getBytes()); // Convert integer to string and write as bytes
            fos.write(System.lineSeparator().getBytes());
            fos.write(String.valueOf(number1).getBytes()); // Write a newline separator

            // fw.write(content); // Write the string content
            // fw.write(String.valueOf(number1) + "\n"); // Write number1 followed by a newline
            // fw.write(String.valueOf(number2) + "\n"); // Write number2 followed by a newline

            System.out.println("Content written to john.txt successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteRead;

            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
