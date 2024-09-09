package file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDisplay {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileDisplay <filename>");
            return;
        }

        String filename = args[0];

        try (FileInputStream inputStream = new FileInputStream("D:\\clg\\II SEM\\OOPS\\sem\\practice\\src\\file\\input.txt")) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file: " + filename);
        }
    }
}
