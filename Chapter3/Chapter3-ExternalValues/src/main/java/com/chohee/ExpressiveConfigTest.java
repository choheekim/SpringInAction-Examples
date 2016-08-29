package com.chohee;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


/**
 * Created by Chohee on 8/28/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class ExpressiveConfigTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void shouldNotBeNull() {
        assertNotNull(compactDisc);
    }

    @Test
    public void play() {
        compactDisc.play();
        assertEquals("Playing Sgt. Peppers Lonely Hearts Club Band by Beatles\n", log.getLog());
    }
}
