package oop.calculateSalary;

public class PartTimeEmployee extends Employee {
    private double workingHours;

    public PartTimeEmployee() {

    }

    public PartTimeEmployee(String name, int paymentPerHour, double workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return (int) (workingHours * getPaymentPerHour());
    }

}
