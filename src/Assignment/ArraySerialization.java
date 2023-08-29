package Assignment;
import java.io.*;
import java.util.*;
public class ArraySerialization {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Pineapple");
        list.add("Apple");
        list.add("Orange");
        Collections.sort(list);

        try{
            // Serialization
            FileOutputStream fout = new FileOutputStream("Mytest.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(list);
            fout.close();
            oos.close();
            System.out.println("File created successfully..");

            // Deserialization
            FileInputStream fis = new FileInputStream("Mytest.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list1 = (ArrayList) ois.readObject();
            System.out.println(list1);

        }catch(IOException e){
            System.out.println("IOException error occurs " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
