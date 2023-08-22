package Assignment;
import java.io.Console;
//import java.io.*;
public class JavaConsoleClass {
    public static void main(String[] args)  {
        Console c = System.console();
        System.out.println("Enter your name: ");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);
        //String name = c.readLine();
        System.out.println("Welcome to the World of Java " + pass);
    }
}
