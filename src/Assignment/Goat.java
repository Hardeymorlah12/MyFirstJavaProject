package Assignment;

public class Goat extends Animal {
    /* Single Inheritance is when a class inherits another class, that is when a single subclass
    inherits from a single Superclass. The Goat class inherits from Superclass(Animal)*/
    private String color;
    private int height;
    public void setColor(String color) {
        this.color = color;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getColor() {
        return color;
    }
    public int getHeight() {
        return height;
    }
    public void move() {
        System.out.println("The goat is moving...");
    }
    public void move(int moveRate) {
    }
    @Override
    public void sleep() {
        System.out.println("The Goat is sleeping...");
    }
   public void bleat(){
        System.out.println("The Goat is bleating...");
    }
    public static void main(String[]args){
        Goat goat = new Goat();
        goat.setSize(30);
        goat.move();
        goat.bleat();
        goat.setHeight(12);
        goat.setColor("Black");
        goat.setLeg("Four Legs");
        goat.sleep();
        System.out.println("The number of Legs is " + goat.getLeg());
        System.out.println("The Height of the Goat is :" + goat.getHeight());
        System.out.println("The Size and Color of the goat is  " + goat.getSize() + " and " + goat.getColor()
                + " respectively.");

    }
}
