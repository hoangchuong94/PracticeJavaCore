package oop.displaynamecar;

public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);

        Car ca3 = new bycical("xe dap", "2 banh");
        System.out.println(Car.numberOfCars);
        ((bycical)ca3).xedap();


    }
}
