package StructuralPatterns.AdapterPattern;

public class AudioPlayer implements MediaPlayer {
    
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename)
    {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3: " + filename);
        } else if (audioType.equalsIgnoreCase("Vlc") || audioType.equalsIgnoreCase("Mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        } else {
            System.out.println("Invalid audio format: " + audioType + " not supported!");
        }
    }
}
