package oop.calculateSalary;

public class tes {
    public static void main(String[] args) {
        Employee employee1 = new PartTimeEmployee("Trung" ,4000, 9);
        System.out.println("Name: " + employee1.getName());

        IEmployee employee2 = new FullTimeEmployee("Linh", 65000);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());

    }
}
