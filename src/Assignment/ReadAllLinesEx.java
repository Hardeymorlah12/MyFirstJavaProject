package Assignment;
import java.io.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;

public class ReadAllLinesEx {
    public static void main(String[] args) throws IOException {
    var filename = "Saheed.txt";
   List<String> list = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
   for(String lines : list){System.out.println(lines);
   }
        }

}
