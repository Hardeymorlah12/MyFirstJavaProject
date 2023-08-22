package Assignment;
import java.io.*;
import java.io.BufferedWriter;
public class JavaIOWriter {
    public static void main(String[] args) throws Exception{
       FileWriter writer = new FileWriter("Output.txt");
       BufferedWriter bw = new BufferedWriter(writer);
       bw.write("I love Java Programming...");
       // System.out.println(" ");
        bw.write("This is the way I wanted to be...");
        bw.close();
        System.out.println("Success");

        FileReader reader = new FileReader("output.txt");
        BufferedReader bf = new BufferedReader(reader);

        int i;
        while ((i=bf.read()) != -1){
            System.out.print((char)i);
        }
        bf.close();
        reader.close();

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter your name: ");
        String name = br.readLine();
        System.out.println("Welcome " + name);

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        String myname = " ";
        while (!myname.equals("finish")){
            System.out.println("Enter data: ");
            myname = bufferedReader.readLine();
            System.out.println("data is: " + myname);
        }
        bufferedReader.close();
        input.close();
    }
}
