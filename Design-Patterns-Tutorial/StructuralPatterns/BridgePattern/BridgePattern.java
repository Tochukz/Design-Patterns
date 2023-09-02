package StructuralPatterns.BridgePattern;

public class BridgePattern {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}


/**
Bridge Pattern
-------------- 
DrawAPI is the bridge interface. 
RedCircle and GreenCircle both implements the DrawAPI interface enfocing a definition of a drawCircle method. 
Circle accepts an instance of a DrawAPI object and other circle parameters. 
Circle also extends Shape abstract class. 
Shape abstract class contains theabstract draw method.   
We can then draw circles of differenct colors by pasing an instance of the [Color]Circle object to th Circle constractor.


Implementation
--------------
RedCircle and GreenCircle are both implementations of the DrawAPI interface.  
Shape is an abstract class whose constructor accept an object of DrawAPI type and has a Shape.drawabstract method.  
Circle class extends the Shape abstract class and accept an object of DrawAPI, among other circle paraters, for it's contrcutor. 
Circle implements the draw method that draws a circle using the DrawAPI type passed to it's contructor.   

Output:  
  Drawing Circle [color: red, radius: 10, x: 100,, y: 100] 
  Drawing Circle [color: greed, radius: 10, x: 100, y: 100] 
*/