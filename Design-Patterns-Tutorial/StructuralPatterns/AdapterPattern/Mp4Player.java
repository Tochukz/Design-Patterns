package StructuralPatterns.AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {
    
    @Override 
    public void playVlc(String filename) {
        // Do nothing 
    }

    @Override 
    public void playMp4(String filename) {
        System.out.println("Playing mp4: " + filename);
    }
}
