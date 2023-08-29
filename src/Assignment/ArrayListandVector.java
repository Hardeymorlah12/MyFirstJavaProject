package Assignment;


import java.util.*;

public class ArrayListandVector {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Saheed");
        list.add("Ayinde");
        list.add("Ademola");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // Vector
        Vector<String> v = new Vector<String>();
        v.addElement("Adewale"); // method of Collection
        v.addElement("Kareem");
        v.addElement("Gratitude");

        Enumeration num = v.elements();
        while (num.hasMoreElements()) {
            System.out.println(num.nextElement());
        }
    }
}
