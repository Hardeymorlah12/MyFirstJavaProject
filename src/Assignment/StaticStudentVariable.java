package Assignment;

public class StaticStudentVariable {
    // If you declare any varible as static, it is known as a static variable.
    int rollno;
    String name;
    static String college = "ITS"; // Static Variable
    // Constructor
    StaticStudentVariable(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    // Method to display the values
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        StaticStudentVariable stv = new StaticStudentVariable(221, "Saheed");
        StaticStudentVariable stv2 = new StaticStudentVariable(343, "Ademola");
        StaticStudentVariable stv3 = new StaticStudentVariable(233, "Ayinde");
        // we can change the college of all Objects by the single line of code
        StaticStudentVariable.college = "Unilorin";
        stv.display();
        stv2.display();
        stv3.display();

    }
    }



