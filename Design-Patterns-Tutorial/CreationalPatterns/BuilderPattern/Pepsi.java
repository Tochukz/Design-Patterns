package CreationalPatterns.BuilderPattern;

public class Pepsi extends ColdDrink {
    
    @Override
    public float price()
    {
        return 10.45f;
    }

    @Override 
    public String name()
    {
        return "Pepsi";
    }
}
