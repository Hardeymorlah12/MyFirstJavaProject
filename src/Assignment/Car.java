package Assignment;
public class Car extends VEHICLE implements Motor {
   private int tyresSize;
    private String CarName;

    public void setTyresSize(int tyresSize) {
        this.tyresSize = tyresSize;
    }
    public void setCarName(String carName) {
        CarName = carName;
    }
    public int getTyresSize() {
        return tyresSize;
    }
    public String getCarName() {
        return CarName;
    }
   private void Park(int SpeedRate, String parkingLot) {
       System.out.println("The Car is about to park at " + SpeedRate + " in the " + parkingLot);
    }
    @Override
    public void start() {
        System.out.println("The Car is starting...");
    }

    public static void main(String[] args){
       Car myCar = new Car();
       myCar.Park(20, "Front Space");
       myCar.start();
       myCar.setWheels(25);
      // myCar.setMotor();
       myCar.setCarName("Lexus");
       myCar.setTyresSize(12);
       //myCar.setMotor(, 23);
        System.out.println("The size of the Car tyre is " + myCar.getTyresSize());
        System.out.println("The name of the Car is: " + myCar.getCarName());
        System.out.println("The wheels of the Car is: " + myCar.getWheels() );
        System.out.println("The Motor Size is: " + myCar.getMotor());
    }
    @Override
    public int MotorSize() {
        return 5;
    }
    @Override
    public String MotorName() {
        return "Suzuki";
    }

}
