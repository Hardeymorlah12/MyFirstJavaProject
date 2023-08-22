package Assignment;

public class FinalHondaBike extends FinalMethodBike {
    // void run(){  // Cannot Override run because it has been made final
      //   System.out.println("The Honda is running safely...");

  //  }
    public static void main(String[] args) {
        FinalHondaBike hondaBike = new FinalHondaBike();
        hondaBike.run();
    }

}
