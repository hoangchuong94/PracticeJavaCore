package oop.informationStudent;

public class Employee extends Person {
    private double salary;

    public Employee() {

    }

    public Employee(String name, String address, double salary) {
        super(name,address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void display() {
        System.out.println("name: " + super.getName());
        System.out.println("address: " + super.getAddress());
        System.out.println("salary: " + getSalary());
    }
}
