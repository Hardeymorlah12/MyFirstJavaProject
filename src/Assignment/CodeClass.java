package Assignment;
import java.io.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CodeClass {
    public static void main(String[] args) throws IOException {
        try{
            FileOutputStream fout = new FileOutputStream("MrJohn.txt");
            String s = """
                    The world is full of mysteries which is beyond the human comprehension
                    God has made the world so beautiful that you've got to praise Him everyday
                    It is so much fun coding here with you sir.
                    I wish I'm granted this opportunity. Thanks in Advance.
                    """;
            byte b [] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("The file has been successfully created...Yuppi!!!");
        }catch (IOException e){
            System.out.println("IOException occurs " + e.getMessage());
        }
        var filename = "MrJohn.txt";
        List<String> list = Files.readAllLines(Path.of(filename), StandardCharsets.UTF_8);
        for(String i : list){
            System.out.println(i);
        }
    }
}
