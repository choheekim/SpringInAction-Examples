package com.chohee.desserts;

import com.chohee.qualifiers.Crispy;
import org.springframework.stereotype.Component;

/**
 * Created by Chohee on 8/28/16.
 */

@Component
@Crispy
public class Cookies implements Dessert {


    public void getName() {
        System.out.println("Cookies");
    }
}
