package oop.calculateSalary;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    public int calculateSalary() {
        return 8 * getPaymentPerHour();
    }
}
