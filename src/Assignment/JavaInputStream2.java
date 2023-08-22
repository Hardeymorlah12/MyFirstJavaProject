package Assignment;
import java.io.*;

public class JavaInputStream2 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("Saheed.txt");
            int i = 0;
            while((i=file.read())!= -1){
                System.out.print((char)i);
            }
            file.close();

        }catch (IOException e){
            System.out.println("IOException occurs " + e.getMessage());
        }
    }

}
