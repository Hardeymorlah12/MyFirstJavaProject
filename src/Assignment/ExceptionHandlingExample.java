package Assignment;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Division by zero will throw an Arithmetic Exception
            int result = 10/0;
            System.out.println(result);
        }catch (ArithmeticException e){
            // Catching the ArithmeticException and handling it
            System.out.println("An arithmetic exception:" + e.getMessage());
        }finally {
        // Executed regardless of whether an exception occurred or not
            System.out.println("Finally block is executed");
        }
        try{
            // Attempting to convert a string to an integer will throw a NumberFormat Exception
            int number = Integer.parseInt("abc");
            System.out.println(number);
        }catch (NumberFormatException e){
            // Catching the NumberFormatException and handling it
            System.out.println("Number format exception occurred:" + e.getMessage());
        }finally {
            // Executed regardless of whether an exception occurred or not
            System.out.println("Finally block is executed");
        }
        }
    }

