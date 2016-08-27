package com.chohee;

import org.springframework.stereotype.Component;

/**
 * Created by Chohee on 8/26/16.
 */

//naming the bean different than default -> @Component("desiredName")
@Component
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " +  artist);
    }
}
