package Assignment;
public class Kid extends Goat {
    /*  Multilevel Inheritance: This is when there's a chain of inheritance, that is when a class inherits
      from a subclass. In this example, kid inherits from Goat class which also inherits from SuperClass (Animal).*/


   private void weeps(){
        System.out.println("The kid is weeping...");
    }
    /* Overriding occurs when a subclass has the same method as the parent class. Method overriding occurs
    when a subclass provides a particular implementation of a method declared by one of its parent classes. */
    @Override
    public void bleat(){
        System.out.println("The kid is bleating ...");
    }
    @Override
    public void sleep(){
        System.out.println("The kid is sleeping...");
    }
    @Override
    public void move() {
        System.out.println("The kid is moving slowly");
    }

    @Override
    public void move(int moveRate) {
       // super.move(20);
        System.out.println("The move rate of the Kid is : " + moveRate);
    }

    public static void main(String[]args){
       Kid k = new Kid();
       k.bleat();
       k.setColor("Brown");
       k.setHeight(6);
       k.setSize(5);
       k.setLeg("Four Legs");
       k.move();
       k.move(20);
       k.sleep();
       k.weeps();
        System.out.println("The attributes of the Kid are as follows: " + "Color: " + k.getColor() + "," +
                 " " + "Number of Legs: " + " " + k.getLeg() + "," +  " " +"Size: " + " " + k.getSize() + ", " +
                "Kid's height: " + " " + k.getHeight());

    }
}
