package ro.cegeka.designpatterns.factory.exercise;

public class Main {

    public static void main(String[] args) {
        try {
            Triangle triangle = (Triangle) ShapeFactory.getInstance().getShape("triangle", 5, 10);
            Square square = (Square) ShapeFactory.getInstance().getShape("square", 10);
            Rectangle rectangle = (Rectangle) ShapeFactory.getInstance().getShape("rectangle", 10, 15);

            System.out.println(triangle.toString() + square.toString() + rectangle.toString());
        } catch (Exception e) {
            e.printStackTrace();;
        }
    }
}
