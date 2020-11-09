package com.company;

public class Employee extends Person{
    private int empId;

    public Employee(String name, String gender, int id) {
        super(name, gender);
        this.empId = id;
    }

    @Override
    public void work() {
        if(empId == 0){
            System.out.println("Not working");
        }else{
            System.out.println("Working as employee!!");
        }
    }

    public static void main(String args[]){
        Person student = new Employee("Patricia","Female",0);
        Person employee = new Employee("Eliot","Male",420);
        student.work();
        employee.work();
        employee.changeName("Mr Robot");
        System.out.println(employee.toString());
    }
}
