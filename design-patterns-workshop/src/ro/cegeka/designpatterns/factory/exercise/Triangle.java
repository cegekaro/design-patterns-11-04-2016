package ro.cegeka.designpatterns.factory.exercise;

public class Triangle extends Shape {

    public Triangle(int base, int height) {
        this.width = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.width * this.height) / 2;
    }
}
