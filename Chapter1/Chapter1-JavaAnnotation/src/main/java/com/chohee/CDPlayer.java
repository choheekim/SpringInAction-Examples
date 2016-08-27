package com.chohee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Spring creates the CDPlayers bean, it should instantiate it via that constructor and pass in a bean
 * that is assignable to CompactDisc
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;


    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    /** Using @Autowired annotation with setter
     @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

     **/

    public void play() {
        cd.play();
    }


}
