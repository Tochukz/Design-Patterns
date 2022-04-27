package CreationalPatterns.FactoryPattern;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        
        Shape circle = factory.getShape("Circle");
        circle.draw();

        Shape square = factory.getShape("Square");
        square.draw();

        Shape rectangle = factory.getShape("Rectangle");
        rectangle.draw();
    }
}

/**
FactoryPattern
--------------
Instead of creating an object directly using the new operator, we have a Factory class that generate the directed object for use when needed.

Implementation 
--------------
We have Circle, Square and Rectangle classes which implement the Shape interface.  
We alsohave the ShapeFactory with the method ShapeFactory.getShape which instantiate and return the desired object.

Output
--------- 
  Circle drawn
  Square drawn
  Rectangle drawn
*/