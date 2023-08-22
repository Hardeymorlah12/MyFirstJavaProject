import java.util.Arrays;

public class SimplePractice {
    public static void main(String[] args) {
        int [] numbers = new int [4];
        numbers[0] = 3;
        numbers [1]= 5;
        numbers [2] = 4;
        numbers[3] = 6;

        System.out.println(numbers[2]);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers.length);
        for(int i = 0; i<numbers.length; i++){
            System.out.println(i);
        }
        int [] mynum = {4, 5, 7, 9};
        System.out.println(Arrays.toString(mynum));
        System.out.println(mynum.length);
        System.out.println(mynum[3]);

        String [] names = {"Saheed", "Nafisat", "Fatihah", "Vivian"};
        System.out.println("The elements of the Array are as follows: " + Arrays.toString(names));
        System.out.println("The length of the Array is: " + names.length);
        System.out.println("The first element is: " + names[0]);
        for(int j = 0; j< names.length; j++){
            System.out.println(j);
        }
        try{
            int result = 20/0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("The Arithmetic exception: " + e.getMessage());
        }finally {
            System.out.println("Finally block is executed");
        }
    }
}
