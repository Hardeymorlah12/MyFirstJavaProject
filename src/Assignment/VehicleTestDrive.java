package Assignment;

public class VehicleTestDrive {
    public static void main(String[] args){
        VEHICLE car = new Car();
        Car myCar = new Car();
        VEHICLE Mcycle = new Motorcycle();
        Motorcycle motorcycle = new Motorcycle();
        car.start();
        myCar.setTyresSize(50);
        myCar.setCarName("Toyota");
        //myCar.Park();
        myCar.start();
        myCar.setWheels(30);
        Mcycle.start();
        Mcycle.setWheels(20);
        motorcycle.setTyreSize(10);
        motorcycle.setMotorcycleName("Power Bike");
        motorcycle.start();
       // motorcycle.Stop();
        System.out.println("The name of the Car is " + myCar.getCarName());
        System.out.println("The Car's tyre size is " + myCar.getTyresSize());
        System.out.println("The car wheel is " + myCar.getWheels());
        System.out.println("The name of the MotorCycle is " + motorcycle.getMotorcycleName());


    }
}
