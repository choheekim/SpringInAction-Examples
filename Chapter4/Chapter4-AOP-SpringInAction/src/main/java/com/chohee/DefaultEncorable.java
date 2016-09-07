package com.chohee;

import org.springframework.stereotype.Component;

/**
 * Created by Chohee on 9/6/16.
 */

@Component
public class DefaultEncorable implements Encoreable{
    public void performEncore() {
        System.out.println("Encording the current performance");
    }
}
