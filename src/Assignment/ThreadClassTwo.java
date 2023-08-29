package Assignment;

public class ThreadClassTwo implements Runnable {
    String name;
    Thread thread;

    ThreadClassTwo(String name){
        this.name = name;
        thread = new Thread(this,name);
        System.out.println("A New thread: " + thread + "is created\n");
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int j = 5; j > 0; j--) {
                System.out.println(name + ": " + j);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + " thread Interrupted");
        }
        System.out.println(name + " thread exiting.");


    }

    public static void main(String[] args) {
        new ThreadClassTwo("1st");
        new ThreadClassTwo("2nd");
        new ThreadClassTwo("3rd");

        try {
            Thread.sleep(8000);
        }catch (InterruptedException ex){
            System.out.println(" Interruption occurs in Main Thread");
        }
        System.out.println(" We are exiting  from Main");
    }
}
