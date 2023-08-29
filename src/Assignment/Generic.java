package Assignment;

import java.util.*;

public class Generic {
    public static void main(String[] args) {
        // Example of Generic using ArrayList

        // Without Generics, we can store any type of objects.
        List list = new ArrayList();
        list.add(10);
        list.add("10");

        // With Generics, we can store any type of objects
        List<String> list1 = new ArrayList<>();
        list1.add("Saheed");
       // list1.add(10); // compile time error

        // 2. Type casting is not required: There is no need to typecast the object
        // Before Generics, we need to type cast

        List list2 = new ArrayList();
        list2.add("hello");
        String s = (String) list2.get(0);  // typecasting

        // After Generics, we don't need to typecast the object
        List<String> list3 = new ArrayList<>();
        list3.add("hello");
        String s1 = list3.get(0);

        // Full Example of Generics in Java
        // Here we are using ArrayList class, but we can use any collection class such as
        // ArrayList, LinkedList, HashSet, TreeSet, HashMap, Comparator

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Saheed");
        list4.add("Optimist");
        String s2 = list4.get(0);
        System.out.println("Element is: " + list4);

        Iterator<String> itr = list4.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());


        }

        // Example of Generics using Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ade");
        map.put(2, "Hello");

       Set<Map.Entry<Integer, String>> set = map.entrySet();
       Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
       while (iterator.hasNext()){
       Map.Entry e = iterator.next();  // no need to typecast
           System.out.println(e.getKey() + " " + e.getValue());

       }

    }
}