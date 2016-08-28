package com.chohee;

import com.chohee.desserts.Dessert;
import com.chohee.qualifiers.Cold;
import com.chohee.qualifiers.Creamy;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Chohee on 8/28/16.
 */
public class DessertShop implements Store {

    Dessert myDessert;


    @Autowired
    @Cold
    @Creamy
    public void setMyDessrt(Dessert dessert) {
        this.myDessert = dessert;

    }
    public void confirmOrder() {
        System.out.print("You have ordered ");
        myDessert.getName();
    }
}
