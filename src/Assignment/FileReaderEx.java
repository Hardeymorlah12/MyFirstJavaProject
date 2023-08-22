package Assignment;
import java.io.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;

public class FileReaderEx {
    public static void main(String[] args) {
        var filename = "Saheed.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filename, StandardCharsets.UTF_8))){
            var sb = new StringBuilder();

            String line;
            while ((line = br.readLine()) != null){
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            System.out.println(sb);
        }catch(IOException e){
            System.out.println("IOException error occurs " + e.getMessage());
        }
    }
}