package Assignment;


import java.util.ArrayList;
import java.util.Iterator;

public class MyStudent {
    private int rollno;
    private String name;
    private int age;
    private static String school = "University of Ilorin";

    public MyStudent(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
       // this.school = school;


    }

    public static void main(String[] args) {
        MyStudent student1 = new MyStudent(1, "Saheed", 35);
        MyStudent student2 = new MyStudent(2, "Hardeymorlah", 25);
        MyStudent student3= new MyStudent(3, "Ayinde", 15);
        MyStudent student4 = new MyStudent(4, "Nafisat", 55);
        MyStudent student5 = new MyStudent(5, "Adewale", 75);
        MyStudent student6 = new MyStudent(6, "Fatihah", 20);

        // Changing of the static variable
        //MyStudent.school = "Univesity of Ibadan";

        ArrayList<MyStudent> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        Iterator itr = students.iterator();
        while (itr.hasNext()){
            MyStudent st = (MyStudent)itr.next();
            System.out.println("Student's Id: " + st.rollno + " " + "Student's Name: " + st.name + " "
                    + "Student's Age: " + " " + st.age + " " + "Institution: " + school);
        }
    }

}
