package oop.informationStudent;

public class Customer extends Person {
    private int balanece;

    public Customer(){

    }

    public Customer(String name, String address, int balanece) {
        super(name, address);
        this.balanece = balanece;
    }
    @Override
    public void display() {
        System.out.println("name: " + super.getName());
        System.out.println("address: " + super.getAddress());
        System.out.println("blance: " + balanece);
    }
}
