package Assignment;
import java.io.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesLineEx {
    public static void main(String[] args) throws IOException {
        var filename = "Saheed.txt";
    Files.lines(Paths.get(filename)).forEachOrdered(System.out::println);
    }
}
