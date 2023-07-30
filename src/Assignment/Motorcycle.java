package Assignment;
public class Motorcycle extends VEHICLE{
    private int tyreSize;
    private String MotorcycleName;
    public void setTyreSize(int tyreSize) {
        this.tyreSize = tyreSize;
    }
    public void setMotorcycleName(String motorcycleName) {
        MotorcycleName = motorcycleName;
    }
    public int getTyreSize() {
        return tyreSize;
    }
    public String getMotorcycleName() {
        return MotorcycleName;
    }
    private void Stop(){
        System.out.println("The MotorCycle is stopping...");
    }
    @Override
    public void start() {
        System.out.println("The Motorcycle is starting...");
    }
    private String running(){
        return "running very fast!!!";
    };
    public static void main(String[]args){
        Motorcycle mototorcycle = new Motorcycle();
        mototorcycle.setTyreSize(24);
        mototorcycle.setMotorcycleName("PowerBike");
        mototorcycle.setWheels(22);
        mototorcycle.start();
        mototorcycle.Stop();
        System.out.println("The motorcycle is " + mototorcycle.running());
        System.out.println("The Size of the Motorcycle tyre is: " + mototorcycle.getTyreSize());
        System.out.println("The size of the wheels is " + mototorcycle.getWheels());
        System.out.println("The Name of the MotorCycle is " +  mototorcycle.getMotorcycleName());

    }

}
