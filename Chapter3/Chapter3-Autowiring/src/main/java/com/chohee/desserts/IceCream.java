package com.chohee.desserts;

import com.chohee.qualifiers.Cold;
import com.chohee.qualifiers.Creamy;
import org.springframework.stereotype.Component;

/**
 * Created by Chohee on 8/28/16.
 */

@Component
@Cold
@Creamy
public class IceCream implements Dessert {

    public void getName() {
        System.out.println("IceCream");
    }
}
