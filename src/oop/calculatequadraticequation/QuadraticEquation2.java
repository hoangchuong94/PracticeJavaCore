package oop.calculatequadraticequation;

import java.util.Scanner;

public class QuadraticEquation2 {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation2() {

    }

    public QuadraticEquation2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDenta() {
        return (b * b) - 4 * (a * c);
    }

    public double getRoot1() {
        return (-getB() + Math.pow( getDenta(), 0.5)) / (2 * getA());
    }

    public double getRoot2() {
        return (-getB() - Math.pow( getDenta(), 0.5)) / (2 * getA());
    }

    public void display() {
        if(getDenta() > 0) {
            System.out.println("2 nghiem");
            System.out.println(getRoot1());
            System.out.println(getRoot2());
        }else if(getDenta() == 0) {
            System.out.println("nghiem kep");
            System.out.println(getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        double a = sc.nextDouble();
        System.out.println("Nhap b");
        double b = sc.nextDouble();
        System.out.println("Nhap c");
        double c = sc.nextDouble();



        QuadraticEquation2 quadraticEquation2 = new QuadraticEquation2(a , b, c);
        quadraticEquation2.display();
    }
}
