package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        // Initial list of elements
        ArrayList<String> shape = new ArrayList<>();
        System.out.println("Initial list of elements: " + shape);
        shape.add("Circle");
        shape.add("Rectangle");
        shape.add("Triangle");
        shape.add("Pyramid");
        System.out.println("After invoking add(E e) method: " + shape);  // First Method

        //  Adding an element at the specific position
        shape.add(4, "Cube");
        System.out.println("After invoking add(int index, E element) method: " + shape); // Second Method

        ArrayList<String> shape2 = new ArrayList<>();
        shape2.add("Square");
        shape2.add("Trapezium");
        // Adding second list elements to the first
        shape.addAll(shape2);
        System.out.println("After invoking addAll(Collection<? extends E< c) method: " + shape); // Third Method

        ArrayList<String> shape3 = new ArrayList<>();
        shape3.add("Cone");
        shape3.add("Cuboid");
        // Adding second list elements to the first list at a specific position
        shape.addAll(2, shape3);
        System.out.println("After invoking add(int index, Collection<? extends E< c) method: " + shape); // Fourth method

        shape.remove("Trapezium");
        shape.remove(5);
        System.out.println("After invoking the remove() method: " + shape);

        shape.ensureCapacity(4);
        System.out.println("After invoking the ensureCapacity method: " + shape); // Fifth method

        System.out.println("After invoking the E get (int index) method: " + shape.get(5)); // Sixth method

        System.out.println("After invoking Size() method, Shape is: " + shape.size());

        System.out.println("After invoking isEmpty() method, Is ArrayList Empty:  " + shape.isEmpty() ); // Seventh method

        shape.clear();
        System.out.println("After invoking the clear() method: " + shape);  // Eight method

        System.out.println("After clearing the ArrayList, Is the ArrayList Empty: " + shape.isEmpty());




    }
}
