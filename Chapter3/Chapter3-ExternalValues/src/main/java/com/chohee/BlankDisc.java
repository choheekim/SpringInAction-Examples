package com.chohee;

import org.springframework.stereotype.Component;

/**
 * Created by Chohee on 8/28/16.
 */

@Component
public class BlankDisc implements CompactDisc{

    private String title;
    private String artist;


    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
