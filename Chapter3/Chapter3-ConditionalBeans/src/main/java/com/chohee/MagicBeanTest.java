package com.chohee;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

/**
 * Created by Chohee on 8/28/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicConfig.class)
public class MagicBeanTest {

    @Autowired
    private ApplicationContext applicationContext;


    //the test fails until setting a "magic" property.
    @Test
    public void shouldNotBeNull() {
        assertTrue(applicationContext.containsBean("magicBean"));
    }
}

