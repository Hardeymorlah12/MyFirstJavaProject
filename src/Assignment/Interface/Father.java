package Assignment.Interface;

public class Father implements Fatherly {
    private String name;
    private int height;
    private int age;
    private String complexion;
    private boolean isTall;
    private boolean isHandsome;
    @Override
    public String takeUpResponsibilities () {
        return "He takes up the responsibilities of the family and ensures the security of the house...";
    }

    @Override
    public String praying() {
        return "He prays regularly";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public boolean isTall() {
        return isTall;
    }

    public void setTall(boolean tall) {
        isTall = tall;
    }

    public boolean isHandsome() {
        return isHandsome;
    }

    public void setHandsome(boolean handsome) {
        isHandsome = handsome;
    }


    public static void main(String[] args) {
        Father f = new Father();
        f.setName("Adewale");
        f.setComplexion("Dark Skinned");
        f.setHeight(25);
        f.setAge(105);
        f.setTall(false);
        f.setHandsome(false);
        System.out.println("The name of the Father is: " + f.getName());
        System.out.println("He is " + f.getComplexion() + " in complexion");
        System.out.println("His age is " + f.getAge() + " years");
        System.out.println("His height is " + f.getHeight());
        System.out.println("He is a tall man: " + f.isTall);
        System.out.println("He is an handsome man: " + f.isHandsome);
        System.out.println(f.takeUpResponsibilities());
    }

    }
