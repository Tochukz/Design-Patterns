package CreationalPatterns.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<FoodItem> foodItems = new ArrayList<FoodItem>();

    public void addFoodItem(FoodItem foodItem)
    {
        foodItems.add(foodItem);
    }

    public float getCost()
    {
        float cost = 0.0f;

        for(FoodItem foodItem : foodItems)
        {
            cost += foodItem.price();
        }

        return cost;
    }

    public void showFoodItems()
    {
        for(FoodItem foodItem : foodItems)
        {
            System.out.print("Item: "+ foodItem.name());
            System.out.print(", Packing: "+ foodItem.packing().pack());
            System.out.print(", Price: "+ foodItem.price() + " \n");

        }
    }
}
