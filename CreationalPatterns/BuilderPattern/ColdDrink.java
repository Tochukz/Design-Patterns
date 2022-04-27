package CreationalPatterns.BuilderPattern;

public abstract class ColdDrink implements FoodItem {
    
    @Override
    public Packing packing()
    {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
