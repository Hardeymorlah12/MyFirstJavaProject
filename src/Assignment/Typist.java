package Assignment;

class Typist {
    private String Name = "Saheed";
    private int typingRate = 50;
    private boolean canType = true;
    private double Salary = 50000;
    private char TypingGrade = 'A';
    private String WordTyped = """ 
                Youths obey the Clarion call
                Let us lift our Nation high
                Under the sun or in the rain
                With dedication and selflessness
                Nigeria's ours, Nigeria we serve""";

    private String typing(){
        return "The typist is currently typing...";
    }
    public String getName() {
        return Name;
    }
    public int getTypingRate() {
        return typingRate;
    }
    public boolean isCanType() {
        return canType;
    }
    public double getSalary() {
        return Salary;
    }
    public char getTypingGrade() {
        return TypingGrade;
    }
    public String getWordTyped() {
        return WordTyped;
    }



    public static void main(String[]args){
        Typist maleTypist = new Typist();
        System.out.println(maleTypist.typing());
        System.out.println("The name of the Typist is: " + maleTypist.getName());
        System.out.println("The Typing rate of the Typist is :" + maleTypist.getTypingRate()) ;
        System.out.println("Can the Typist type?: " + maleTypist.canType);
        System.out.println("The Salary of the Typist is : " + maleTypist.getSalary());
        System.out.println("The Typist's grade is : " + maleTypist.getTypingGrade());
        System.out.println("The Typist is typing : " + maleTypist.getWordTyped());
    }


}
