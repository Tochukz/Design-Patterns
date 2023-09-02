package CreationalPatterns.BuilderPattern;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addFoodItem(new VegBurger());
        meal.addFoodItem(new Coke());        
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addFoodItem(new ChikenBurger());
        meal.addFoodItem(new Pepsi()); 
        return meal;
    }
}
