package CreationalPatterns.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeName)
    {
        if (shapeName.equalsIgnoreCase("RECTANGLE"))
        {
            return new Rectangle();
        }
        else if (shapeName.equalsIgnoreCase("SQUARE"))
        {
            return new Square();
        }
        return null;
    }
}
