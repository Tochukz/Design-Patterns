package StructuralPatterns.AdapterPattern;

public class AdapterPattern {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyound the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}

/**

The Adapter Pattern  
-------------------  
The AudioPlayer can only play mp3 audio format but not mp4 or vlc. 
With the help of the MediaAdapter, the AudioPlayer can also support other file format that is does not support by itself.


Implementation 
--------------
Create two interfaces: 
  1. MediaPlayer 
  2. AdancedMediaPlayer 
with play() method. 

Create AudioPlayer class to implement MediaPlayer and support only mp3.  
Create VlcPlayer and Mp4Player to implement AdvancedMediaPlayrter interface andsupport vlc and mp4 audio format respectively.  

In the implementation of AudioPlayer.play method, play the audio directly if the format is mp3 
or use and instance of VlcPlayer or Mp4Player, which are both object ofAdancedMediaPlayer interface, to player if the format is otherwise.  

Output
---------- 
  Playing mp3: beyound the horizon.mp3
  Playing mp4: alone.mp4
  Playing vlc: far far away.vlc
  Invalid audio format: avi not supported!
*/