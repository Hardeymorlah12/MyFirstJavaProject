package Assignment.Interface;

public class Son extends FatherImpl implements Father, Mother {
    private boolean haveDimple;
    public boolean isHaveDimple() {
        return haveDimple;
    }
    public void setHaveDimple(boolean haveDimple) {
        this.haveDimple = haveDimple;
    }

    @Override
    public String doHouseholdChores() {
        return "He washes his father's clothes";
    }

    @Override
    public String plaiting() {
        return "He can't plait the hair";
    }
    public static void main(String[] args) {
        Son s = new Son();
        s.setName("Saheed");
        s.setAge(35);
        s.setHeight(22);
        s.setComplexion("Light skinned");
        s.setHandsome(true);
        s.setTall(false);
        s.setHaveDimple(true);
        s.takeUpResponsibilities();
        s.doHouseholdChores();

        System.out.println("The Son's name is " + s.getName());
        System.out.println("His age is " + s.getAge());
        System.out.println("His height is " + s.getHeight());
        System.out.println("He is " + s.getComplexion() + " in complexion");
        System.out.println("He is an handsome guy: " + s.isHandsome());
        System.out.println("He is a tall guy " + s.isTall());
        System.out.println("He has dimples in his both cheeks: " + s.haveDimple);
        System.out.println(s.doHouseholdChores());
        System.out.println(s.takeUpResponsibilities());

    }
}
