package Assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.*;
public class JavaIO {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("nysc.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An IOException: " + e.getMessage());

        }

    }
}
