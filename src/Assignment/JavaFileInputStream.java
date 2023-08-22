package Assignment;
import java.io.*;
import java.io.FileInputStream;

public class JavaFileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("Saheed.txt");
            int i = file.read();
            System.out.println((char) i);

            file.close();
        } catch (IOException e) {
            System.out.println("IOException occurs " + e.getMessage());
        }
    }
}