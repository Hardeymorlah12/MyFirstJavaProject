package Assignment;

import java.util.HashMap;
import java.util.Map;

public class HashBookClass {
    private int id;
    private String name, author, publisher;
    private int quantity;

    public HashBookClass(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;

    }


    public static void main(String[] args) {
        HashMap<Integer, HashBookClass> book = new HashMap<>();

        HashBookClass bk1 = new HashBookClass(1, "Java", "Saheed", "Java Press", 22);
        HashBookClass bk2 = new HashBookClass(2, "Python", " Hardey", "Python Press", 34);
        HashBookClass bk3 = new HashBookClass(3, "JavaScript", "Damola", "JavaScript Press", 32);
        HashBookClass bk4 = new HashBookClass(4, "Html",  "Ayinde", "Html Press", 55 );


        book.put(1, bk1);
        book.put(2, bk2);
        book.put(3, bk3);
        book.put(4, bk4);
        for(Map.Entry<Integer,HashBookClass> e : book.entrySet()){
            int key = e.getKey();
            HashBookClass bkk = e.getValue();
            System.out.println(key + " " + "Details: ");
            System.out.println(bkk.id+ " " + bkk.name + " " + bkk.author + " " + bkk.publisher + " " + bkk.quantity);
        }
    }
}
