package oop.determineshape;

public class ShapeTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(2,3);
        shapes[2] = new Square(2.3);

        for(Shape shape: shapes){
            System.out.println(shape);
            if(shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }
    }
}
