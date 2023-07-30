package Assignment.Interface;

public class Daughter extends Mother implements Motherly, Fatherly {
    private boolean canDance;
    private String longHair;
    @Override
    public String takeUpResponsibilities() {
        return"She helps with some basic amenities";
    }

    @Override
    public String praying() {
        return "She loves to pray";
    }

    public boolean isCanDance() {
        return canDance;
    }
    public void setCanDance(boolean canDance) {
        this.canDance = canDance;
    }
    public String getLongHair() {
        return longHair;
    }
    public void setLongHair(String longHair) {
        this.longHair = longHair;
    }

    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.setName("Fatihah");
        d.setAge(20);
        d.setHeight(15);
        d.setComplexion("Light skinned");
        d.setLongHair("long hair");
        d.setTall(false);
        d.setCanDance(true);
        d.setBeautiful(true);
        d.doHouseholdChores();
        d.takeUpResponsibilities();

        System.out.println("The daughter's name is: " + d.getName());
        System.out.println("She is " + d.getAge() + " years old.");
        System.out.println("Her height is " + d.getHeight());
        System.out.println("She is " + d.getComplexion() + " in complexion.");
        System.out.println("She has a " + d.getLongHair());
        System.out.println("She is a tall girl: " + d.isTall());
        System.out.println("She is a beautiful girl: " + d.isBeautiful());
        System.out.println("She is a good dancer: " + d.canDance);
        System.out.println(d.doHouseholdChores());
        System.out.println(d.takeUpResponsibilities());
    }


}
