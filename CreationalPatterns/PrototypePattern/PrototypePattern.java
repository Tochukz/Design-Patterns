package CreationalPatterns.PrototypePattern;

public class PrototypePattern {
    public static void main(String[]  args) {
        ShapeCache.loadCache();

        Shape clonedCircle = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedCircle.getType());

        Shape clonedSquare = ShapeCache.getShape(("2"));
        System.out.println("Shape: " + clonedSquare.getType());

        Shape clonedRectangle = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedRectangle.getType());
    }
}

/**
Prototype Pattern
-----------------  
Instead of recreating a costly object each time the object is needed, we can store the object once and return a clone of the object subsequently. 

Implementation 
--------------  
We have Rectangle, Square and Circle classes which all implements the Shape interface.  
We make a ShapeCache classes which defines a ShapeCache.loadCache method that instantiate our disired object(Rectangle, Square and Circle) 
an put them in a hash table.  
Each time an object is needed the ShapeCache.getShape static method is called and it returns the requested shape from the hash table.  

Output
-------
  Shape: Circle
  Shape: Square
  Shape: Rectangle
*/