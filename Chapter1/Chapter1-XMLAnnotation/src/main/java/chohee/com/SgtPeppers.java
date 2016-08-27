package chohee.com;

/**
 * Created by Chohee on 8/27/16.
 */
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " +  artist);
    }
}

