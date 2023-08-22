package Assignment;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MainFileOutputStream2 {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fout = new FileOutputStream("Hardeymorlah.txt");
            String s = """
                    Indeed I'm making progress...
                    It's good to know I'm improving rapidly
                    I'm happy with coding...
                    Coding is fun when you actually knows what to code
                    I wish to see myself coding and working for a big
                    firm in the next few months...""";

            byte [] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("The file has been succcesfully created...");
        } catch (IOException e) {
            System.out.println("IOException occurs " + e.getMessage());
        }
        var filename = "Hardeymorlah.txt";
        List<String> list = Files.readAllLines(Path.of(filename));
        for(String i : list){
            System.out.println(i);
        }
    }}