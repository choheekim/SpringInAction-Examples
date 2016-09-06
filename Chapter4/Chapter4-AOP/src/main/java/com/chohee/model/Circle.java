package com.chohee.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Chohee on 8/29/16.
 */

@Component
public class Circle {

    private String name;

    public String getName() {
        return name;
    }


    @Autowired
    @Value("Circle")
    public void setName(String name) {
        this.name = name;
    }

}
