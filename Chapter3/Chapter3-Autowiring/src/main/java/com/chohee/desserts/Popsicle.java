package com.chohee.desserts;

import com.chohee.qualifiers.Cold;
import com.chohee.qualifiers.Fruity;
import org.springframework.stereotype.Component;

/**
 * Created by Chohee on 8/28/16.
 */

@Component
@Cold
@Fruity
public class Popsicle implements Dessert {

    public void getName() {
        System.out.println("Popsicle");
    }
}
