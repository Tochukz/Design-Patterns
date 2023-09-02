package StructuralPatterns.BridgePattern;

public class GreenCircle implements DrawAPI {
    @Override 
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("Drawing Circle [color: greed, radius: %d, x: %d, y: %d] \n", radius, x, y);
    }
}
