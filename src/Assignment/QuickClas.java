package Assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class QuickClas {
    public static void main(String[] args) throws IOException {
        Properties p1 = new Properties();
        p1.setProperty("Name: ", "Adewale Saheed Ademola");
        p1.setProperty("Email: ", "Saheedadewale950@gmail.com");
        p1.setProperty("Password: ", "Websites");

        p1.store(new FileWriter("Hardey.properties"), "HardeynewProperties");
        System.out.println("File created successfully...");

        FileReader reader = new FileReader("Hardey.properties");
        Properties p2 = new Properties();
        p2.load(reader);

        System.out.println("Name:" + p2.getProperty("Name: "));
        System.out.println("Email: " + p2.getProperty("Email: "));
        System.out.println("Password: " + p2.getProperty("Password: "));

    }

}
