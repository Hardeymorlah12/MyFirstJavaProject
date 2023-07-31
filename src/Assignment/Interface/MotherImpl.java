package Assignment.Interface;

public  class MotherImpl implements Mother {
    private String name;
    private int height;
    private int age;
    private String complexion;
    private boolean isTall;
    private boolean isBeautiful;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
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
    public boolean isBeautiful() {
        return isBeautiful;
    }
    public void setBeautiful(boolean beautiful) {
        isBeautiful = beautiful;
    }
    @Override
    public String doHouseholdChores() {
        return "She cleans and takes good care of the house ";
    }

    @Override
    public String plaiting() {
        return "She's good at plaiting the hairs";
    }


public static void main(String[] args) {
    MotherImpl m = new MotherImpl();
    m.setName("Oluwatoyin");
    m.setAge(95);
    m.setHeight(30);
    m.setTall(true);
    m.setComplexion("light skinned");
    m.setBeautiful(true);
    System.out.println("The mother's name is " + m.getName());
    System.out.println("Her age is " + m.getAge());
    System.out.println("She is " + m.getHeight() + " tall");
    System.out.println("She is a " + m.getComplexion() + " woman");
    System.out.println("She is tall: " + m.isTall);
    System.out.println("She is a beautiful: " + m.isBeautiful);
    System.out.println(m.doHouseholdChores());
    System.out.println(m.plaiting());
}
}
