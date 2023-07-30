package Assignment;
    /*Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
      Inheritance represents IS-A- relationship. Single Inheritance is when a class inherits another class,
      that is when a single subclass inherits from a single Superclass.*/
abstract class Animal {
    private String leg;
    public String getLeg() {
        return leg;
    }
    public void setLeg(String leg) {
        this.leg = leg;
    }
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    private int size;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {

        this.size = size;
    }
  public abstract void move();
        //System.out.println("The Animal is moving...");
    public abstract void move(int moveRate);
    //  }
   public abstract void sleep();
      //  System.out.println("The Animal is sleeping...");

    //}

        }


