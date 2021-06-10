package oop.informationStudent;

public class Tes {
    public static void main(String[] args) {
        Person person1 = new Employee("Trung", "HN", 3300);
        Person person2 = new Customer("linh", "BN", 10400);
        person1.display();
        person2.display();
    }
}
