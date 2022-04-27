package CreationalPatterns.AbstractFactoryPattern;

public class AbstractFactoryPattern {
    public static void main(String[] args)
    {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        Shape rectangle = shapeFactory.getShape(("RECTANGLE"));
        rectangle.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        
        Shape roundedSquare = roundedShapeFactory.getShape("SQUARE"); 
        roundedSquare.draw();

        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
        roundedRectangle.draw();
    }
}

/**
Abstract Factory Pattern 
------------------------
In the factory pattern we had a factory object generate the desired object for us when needed. 
In the abstract factory pattern we first have a super factory class which generate factory for us and the generated factory in turn generate the desired object.  

Implementation
---------------  
We have Rectangle, Square, RoundedRectange and RoundedSquare  which implements the Shape interface 
We also have ShapeFactory and RoundedShapeFactory factory classes which both extends the AbstractFactory abstract class and implements the getShape abstract method.  
The ShapeFactory factory class produces Rectangle and Square objects.
The RoundedShapeFactory factory class produces RoundedRectange and RoundedSquare objects. 
We then have the FactoryProducer superfactory class which generates ShapeFactory or RoundedShapeFactory factory object depending on the required type. 

Ouput
---------- 
  Square drawn
  Rectangle drawn.
  Rounded Sqare drawn
  Rounded Rectangle Drawm
*/