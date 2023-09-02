package StructuralPatterns.AdapterPattern;

public class MediaAdapter implements MediaPlayer {
    
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("Vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("Mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override 
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("Vlc")) {
            advancedMusicPlayer.playVlc(filename);
        } else if (audioType.equalsIgnoreCase("Mp4")) {
            advancedMusicPlayer.playMp4(filename);
        }
    }
}
