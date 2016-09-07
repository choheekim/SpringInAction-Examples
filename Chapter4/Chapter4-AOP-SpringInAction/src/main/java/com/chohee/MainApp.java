package com.chohee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Chohee on 9/6/16.
 */
public class MainApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PerformanceConfig.class);
        Performance performance = (Performance) applicationContext.getBean("concert");
        performance.perform();
    }
}
