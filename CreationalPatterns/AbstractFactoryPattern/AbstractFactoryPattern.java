package CreationalPatterns.AbstractFactoryPattern;

public class AbstractFactoryPattern {
    public static void main(String[] args)
    {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        Shape rectangle = shapeFactory.getShape(("RECTANGLE"));
        rectangle.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        
        Shape roundedSquare = roundedShapeFactory.getShape("SQUARE"); 
        roundedSquare.draw();

        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
        roundedRectangle.draw();
    }
}
