package Assignment;
import java.io.FileInputStream;
import java.io.*;
public class MainFileOutputStream {
    public static void main(String[] args) {
        // 1. Writing Byte
        try{
            FileOutputStream fout= new FileOutputStream("Saheed.txt");
            fout.write(65);
            fout.close();
            System.out.println("Success...");

        }catch (IOException e){
            System.out.println("IOException error occurs " + e.getMessage());
        }

    }
}
// Output: The content of a text file Saheed.txt is set with the data A.