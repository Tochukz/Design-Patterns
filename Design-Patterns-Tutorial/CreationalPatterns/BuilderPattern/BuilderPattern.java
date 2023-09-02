package CreationalPatterns.BuilderPattern;

public class BuilderPattern {
    public static void main(String[] args)
    {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal:");
        vegMeal.showFoodItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\nNon-Veg Meal:");
        nonVegMeal.showFoodItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
 
/**
Builder Pattern 
---------------
A meal is made up of Drink, Food and Packing. 
All of these objects are instantiated inside of the MealBuilder.prepareVegMeal or MealBuilder.prepareNonVegMeal method. 

Implementation
--------------  
We have the Wrapper and Bottle classes which implements the Packing interface. They are used for packing food and drink respectively. 
We then have the ColdDrink and Burger abstract classes which implements the FoodItem interface.
Coke and Pepsi classes extends the ColdDrink abstract class 
 while ChikenBurger and VegBurger extends the Burger abstract class. 
The Meal class contains a FoodItem List and an addFoodItem method to add FoodItem objects to the FoodItem List.
The MealBuilder class prepareVegMeal/prepareNonVegMeal method initialized a meal object and adds instances of the desired ColdDrink
 and Burger objects to the FoodItem List.  

Output
-------
  Veg Meal:
  Item: Vegetable Bugger, Packing: Wrapper, Price: 100.05 
  Item: Coke, Packing: Bottle, Price: 10.59
  Total Cost: 110.64

  Non-Veg Meal:
  Item: Chiken Burger, Packing: Wrapper, Price: 90.99
  Item: Pepsi, Packing: Bottle, Price: 10.45
  Total Cost: 101.439995 
*/
