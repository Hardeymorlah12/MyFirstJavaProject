package Assignment;

import java.util.ArrayList;

public class ArrayListAddElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("Initial list of elements: " + fruits);
        // Adding elements to the end of the list
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grape");

        System.out.println("After invoking add(E e method) " + fruits);
        // Adding an element at the specific position
        fruits.add(1, "Pineapple");
        System.out.println("After invoking add(int index, E element) method " + fruits);

        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("Banana");
        fruits2.add("Guava");

        // Adding second list elements to the first list
        fruits.addAll(fruits2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method:" + fruits);

        ArrayList<String> fruits3 = new ArrayList<>();
        fruits3.add("Dates");
        fruits3.add("Tangerine");
        // Adding second list elements to the first at specific position
        fruits.addAll(1, fruits3);
        System.out.println("After invoking addAll(int index, Collections<? extends E> c) method: " + fruits);

        // Removing specific element from Arraylist
        fruits.remove("Tangerine");
        System.out.println("After invoking remove(object) method " + fruits);

        // Removing elements on the basis of specific position
        fruits.remove(1);
        System.out.println("After invoking remove(index) method: " + fruits);

        fruits.clear();
        System.out.println(fruits);

        // Removing elements on the basis of specified condition
        fruits.removeIf(str -> str.contains("Mango"));
    }
}