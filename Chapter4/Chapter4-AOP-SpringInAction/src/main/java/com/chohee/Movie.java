package com.chohee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Chohee on 9/6/16.
 */

@Component
@PropertySource("performance.properties")
public class Movie implements Performance {

    private String name;
    private String period;

    public String getName() {
        return name;
    }

    @Autowired
    @Value("${movie.name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getPeriod() {
        return period;
    }

    @Autowired
    @Value("${movie.period}")
    public void setPeriod(String period) {
        this.period = period;
    }


    public void perform() {
        System.out.println(this.getName() + " will be performed for next " + this.getPeriod() + " minutes.");
    }
}
