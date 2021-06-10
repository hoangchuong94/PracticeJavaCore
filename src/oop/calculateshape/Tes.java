package oop.calculateshape;

public class Tes {
    public static void main(String[] args) {
        IShape[] iShapes = new IShape[3];
        iShapes[0] = new Circle(3);
        iShapes[1] = new Rectangle(5,7);
        iShapes[2] = new Rectangle(10,12);
        for(int i = 0; i < iShapes.length; i++) {
            System.out.println("Area of Shape " + i + iShapes[i].getArea() );
            System.out.println("Premeter of Shape " + i +iShapes[i].getPerimeter() );
        }
    }
}
