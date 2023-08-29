package Assignment;

public class ThreadClass extends Thread {
    /*
    A Thread class has several methods and constructors which allow us to perform various operations on a thread. The
    Thread class extends the Object class. THe Object class implements the Runnable interface. The thread class has the
    following constructors that are used to perform various operations
     */

    /*
    Runnable Interface(run() method)
    The runnable interface gives us the run() method to perform an action for the thread.

    start() method is used for starting a thread that we have newly created. It starts a new thread with a new call
    stack.
     */

    // run() method to perform action for thread.
    public void run(){
        int a = 10;
        int b = 12;
        int result = a + b;
        System.out.println("Thread started running...");
        System.out.println("Sum of two numbers is: " + result);
    }

    public static void main(String[] args) {
        // Creating instance of the class extend Thread class
        ThreadClass thread1 = new ThreadClass();
        thread1.start();
    }
}
