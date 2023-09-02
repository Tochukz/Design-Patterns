package CreationalPatterns.BuilderPattern;

public class ChikenBurger extends Burger {
    
    @Override
    public float price()
    {
        return 90.99f;
    }

    @Override 
    public String name()
    {
        return "Chiken Burger";
    }
}
