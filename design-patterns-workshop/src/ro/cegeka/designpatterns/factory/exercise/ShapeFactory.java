package ro.cegeka.designpatterns.factory.exercise;

public final class ShapeFactory {

    private static ShapeFactory instance;

    public ShapeFactory() {
    }

    public static ShapeFactory getInstance() {
        if (null == instance) {
            instance = new ShapeFactory();
        }

        return instance;
    }

    public Shape getShape(String shape, int width) throws Exception {
        return this.getShape(shape, width, 0);
    }

    public Shape getShape(String shape, int width, int height) throws Exception {
        switch (shape) {
            case "triangle":
                return new Triangle(width, height);
            case "square":
                return new Square(width);
            case "rectangle":
                return new Rectangle(width, height);
            default:
                throw new Exception("Undefined shape");
        }
    }
}
