package Assignment;

public class Monkey extends Animal {
    /*
    Hierarchical Inheritance: This is when two or more classes inherits a single class. The Monkey and Goat classes
        inherit the superclass (Animal).*/

   private void jump(){
        System.out.println("The Monkey is jumping...");
    }
    @Override
    public void move() {
    }
    @Override
    public void move(int moveRate) {
        System.out.println("The Monkey is moving at the rate of " + moveRate);
    }
    @Override
    public void sleep() {
        System.out.println("The Monkey is sleeping....");
    }
    public static void main(String[]args){
       Monkey monkey = new Monkey();
       monkey.sleep();
       monkey.setColor("Brown");
       monkey.setLeg("Two Legs");
       monkey.setSize(30);
       monkey.move(43);
       monkey.jump();
        System.out.println("The attributes of the Monkey are as follows: " + "Color: " + monkey.getColor() + "," +
                " " + "Number of Legs: " + " " + monkey.getLeg() + "," +  " " +"Size: " + " " + monkey.getSize());

    }

}
