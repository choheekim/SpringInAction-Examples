package chohee.com;

import java.util.List;

/**
 * Created by Chohee on 8/27/16.
 */
public class BlankDisc implements CompactDisc {

    private String album;
    private String artist;
    private List<String> tracks;


    public BlankDisc(String album, String artist, List<String> tracks) {
        this.album = album;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + album + " by " + artist);
        for(String track : tracks) {
            System.out.println("-Track: " + track );
        }
    }
}
