package Assignment;
import java.util.*;
public class HashMapClass {
    public static void main(String[] args) {

        // Non Generic
        Map map = new HashMap();
        // Adding elements to map
        map.put(1, "Saheed");
        map.put(2, "Ademola");
        map.put(3, "Ayinde");
        // Traversing Map
        Set set = map.entrySet(); // Converting to set so that we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            // Converting to Map.Entry so that we can get Key and Value separately
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        // Generic (New Style)
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(100, "Samad");
        map2.put(101, "Ghaniy");
        map2.put(102, "JagunJagun");
        for(Map.Entry m : map2.entrySet()) {
            System.out.println("Key: " + m.getKey() + " " + "Value: " + m.getValue());
        }
            
        // HashMap
        HashMap<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "Organge");
        fruits.put(2, "Mango");
        fruits.put(3, "Pineapple");
        fruits.put(4, " Apple");
        System.out.println("Iterating Hashmap...");
        for(Map.Entry myfruits : fruits.entrySet()){
            System.out.println("Key: " + myfruits.getKey() + " " + "Value: " + myfruits.getValue());

        }
    }
}
