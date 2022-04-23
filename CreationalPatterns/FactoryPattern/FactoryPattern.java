package CreationalPatterns.FactoryPattern;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        
        Shape circle = factory.getShape("Circle");
        circle.draw();

        Shape square = factory.getShape("Square");
        square.draw();

        Shape rectangle = factory.getShape("Rectangle");
        rectangle.draw();
    }
}
