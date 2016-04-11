package ro.cegeka.designpatterns.factory.exercise;

abstract public class Shape {

    protected int width;

    protected int height;

    abstract public double getArea();

    @Override
    public String toString() {
        return String.format("The area of the %s is %f\n",
                this.getClass().getSimpleName(),
                this.getArea());
    }
}
