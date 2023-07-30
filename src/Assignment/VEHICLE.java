package Assignment;
  abstract class VEHICLE {
        /*  Abstract Classes are classes declared with Abstract. They can be subclassed or extended.
        * You cannot create an object of a Vehicle because a vehicle is itself an abstract, general concept.
        * You can extend the functionality of the vehicle class to create a Car or a Motorcycle. */
      private int wheels;
      private Motor motor;
      public abstract void start();

      public int getWheels() {
          return wheels;
      }
      public void setWheels(int wheels) {
          this.wheels = wheels;
      }
      public Motor getMotor() {
          return motor;
      }
      public void setMotor(Motor motor) {
          this.motor = motor;
      }




           //System.out.println("The Vehicle is starting...");





  }
