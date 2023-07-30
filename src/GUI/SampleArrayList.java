package GUI;
import java.util.ArrayList;
public class SampleArrayList {

    static String myMethod(String FirstName, String LastName){
        return FirstName + " " + LastName ;
    }

    static int myMethod(int a, int b){
        return a+b;
    }
 static void pMethod(String FirstName, String LastName, String occupation, int age, int Height){
     System.out.println(FirstName + LastName + occupation + age + Height);

 }

    public static void main(String[] args) {


        ArrayList<Egg> myList = new ArrayList<Egg>();
        Egg localEgg = new Egg();
        Egg modernEgg = new Egg();
        Egg newEgg = new Egg();
        myList.add(localEgg);
        myList.add(modernEgg);
        myList.add(newEgg);
        int theSize = myList.size();
        boolean isIn = myList.contains(localEgg);
        boolean isEmpty = myList.isEmpty();
        System.out.println("Is local Egg contained in the List? " + isIn);
        System.out.println("The size of the List is :" + theSize);
        System.out.println("Is the list Empty? " + isEmpty);
       // System.out.println(4&2);
        int x = 5;
        x <<= 3;
        System.out.println(x);
        System.out.println(myMethod(12, 45));
        System.out.println(myMethod(" FIRSTNAME: " + "SAHEED", " LASTNAME: " + "ADEWALE"));

    }
}