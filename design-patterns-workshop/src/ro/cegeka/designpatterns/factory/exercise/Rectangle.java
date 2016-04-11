package ro.cegeka.designpatterns.factory.exercise;

public class Rectangle extends Shape {

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
