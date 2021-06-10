package oop.studencodegym;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mary");
        student.setClasses("C0421");
        System.out.println(student.getName() + student.getClasses());
    }
}
