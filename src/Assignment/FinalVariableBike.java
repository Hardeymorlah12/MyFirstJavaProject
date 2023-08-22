package Assignment;

public class FinalVariableBike {
    // If you make any variable as final, you cannot change the value of final variable(it will be constant.)
    final int speedlimit = 90;
    //speedlimit = 120; // cannot assign value to speedlimit bcos it has been made final.

    void run (){
        System.out.println("The Bike is moving at the speedlimit of " + speedlimit);;
    }

    public static void main(String[] args) {
        FinalVariableBike bike = new FinalVariableBike();
        bike.run();

    }
}
