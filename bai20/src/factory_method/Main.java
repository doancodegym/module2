package factory_method;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        Shape shape2 = shapeFactory.getShape("Square");
        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        shape2.draw();
        shape3.draw();
}

}
