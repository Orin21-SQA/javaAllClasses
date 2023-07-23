package Encapsulation;

public class Employee {

    public String employee_name ="ORIN";
    private int salary=30000;
    public String designation="SQ";

    public Employee() {
        this.employee_name = employee_name;
        this.salary = salary;
        this.designation = designation;
    }

    private void displaysalary(){
        System.out.println("salary is"+salary);

    }


}
