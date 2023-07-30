package Assignment;

public class Staff extends Employee {
    private int salary;
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

     void work(){
        System.out.println("The Staff is ready to Work...");
    }
}
