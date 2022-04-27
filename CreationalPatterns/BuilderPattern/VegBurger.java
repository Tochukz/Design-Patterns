package CreationalPatterns.BuilderPattern;

public class VegBurger extends Burger {
    
    @Override
    public float price()
    {
        return 100.05f;
    }

    @Override 
    public String name()
    {
        return "Vegetable Bugger";
    }
}
