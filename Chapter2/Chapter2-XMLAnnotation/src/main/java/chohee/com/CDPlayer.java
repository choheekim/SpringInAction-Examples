package chohee.com;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Chohee on 8/27/16.
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }
}
