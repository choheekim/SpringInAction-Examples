package com.chohee.desserts;

import com.chohee.qualifiers.Soft;
import org.springframework.stereotype.Component;

/**
 * Created by Chohee on 8/28/16.
 */

@Component
@Soft
public class Cake implements Dessert {


    public void getName() {
        System.out.println("Cake");
    }
}
