package ro.cegeka.designpatterns.factory.exercise;

public class Square extends Shape {

    public Square(int size) {
        this.width = size;
        this.height = size;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
