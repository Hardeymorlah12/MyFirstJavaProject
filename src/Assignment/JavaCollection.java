package Assignment;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.nio.*;

public class JavaCollection {
    public static void main(String[] args) throws IOException {
        // Java ArrayList Example
        ArrayList<String> list = new ArrayList<>();
        // Creating an arraylist
        list.add("Biology");  // Adding object to the arraylist
        list.add("Islamic Studies");
        list.add("Government");
        list.add("Java");
        list.add("Chemistry");
        // Printing the arraylist
        System.out.println(list);
        System.out.println("=====Printing through Iterator====");
        // Traversing through iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=====Printing through For-each ====");
        // Printing with for-each method
        for(String subjects : list){
            System.out.println(subjects);
        }
        System.out.println("====Printing through accessing the element====");
        System.out.println(list.get(1));

        Collections.sort(list);
        System.out.println("====Printing Sorted list using for-each method====");
        for(String sorted : list){
            System.out.println(sorted);
        }


        // After Setting and Getting
        System.out.println("======After Setting and Getting========");
        // Get and Set an ArrayList
          list.set(0, "Java");
          list.set(3, "JavaScript");
          list.set(1, "Html and Css");
          list.set(2, "PHP");
          list.set(4, "Python");

        for(String j : list){
            System.out.println(j);

        }
        System.out.println("=====Printing through Accessing the element====");
        // Accessing the elements
        System.out.println(list.get(1));

        System.out.println("====Printing using Iterator");
            // Traversing through an iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("===Printing using for-each method===");
        // Printing out the arraylist using for-each method
        for(String i : list){
            System.out.println(i);
        }
        Collections.sort(list);
        System.out.println("===Printing sorted list using for-each method===");
        for(String sorted : list){
            System.out.println(sorted);

        }

    }
    }

