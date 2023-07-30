package Assignment;

public class EmployeeTestDrive {
    public static void main(String[]args){
        Employee emp = new Employee();
        Staff stf = new Staff();
        emp.setId(12);
        emp.setName("Saheed");
        emp.setAge(25);
        System.out.println(emp.getId() + " " + emp.getAge() + " " + emp.getName());
        stf.setSalary(20000);
        stf.setAge(25);
        stf.work();
        System.out.println(stf.getSalary() + " " + stf.getAge());
    }
}
