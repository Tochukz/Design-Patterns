package CreationalPatterns.BuilderPattern;

public class Coke extends ColdDrink {

    @Override
    public float price()
    {
        return 10.59f;
    }

    @Override
    public String name()
    {
        return "Coke";
    }
}
