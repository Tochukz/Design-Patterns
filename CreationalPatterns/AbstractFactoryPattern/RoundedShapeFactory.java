package CreationalPatterns.AbstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory {
    @Override 
    public Shape getShape(String shapeName)
    {
        if (shapeName.equalsIgnoreCase("RECTANGLE"))
        {
            return new RoundedRectangle();
        }
        else if (shapeName.equalsIgnoreCase("SQUARE"))
        {
            return new RoundedSquare();
        }

        return null;

    }
}
