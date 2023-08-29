package Assignment;

import javax.sound.midi.Soundbank;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

// Example of Properties class to get information from the properties file
public class PropertiesFiles {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("info.properties");

        Properties p = new Properties();
        p.load(reader);

        System.out.println(p.getProperty("Name: "));
        System.out.println(p.getProperty("Email:"));

        // Examples of Properties class to get all the system properties by using System.getProperties() method
        Properties p2 = System.getProperties();
        Set set = p2.entrySet();

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());

            // Example of Properties class to create the properties file
            Properties p3 = new Properties();
            p3.setProperty("Name: ", "Saheed Adewale");
            p3.setProperty("Email:", "Saheedadewale950@gmail.com");
            p3.store(new FileWriter("info.properties"), "Saheed Properties Example");
        }

    }
}
