package com.chohee;

import com.chohee.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Chohee on 8/29/16.
 */
public class AppMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ShapeConfig.class);
        ShapeService shapeService = (ShapeService) applicationContext.getBean("shapeService");

        shapeService.getCircle().setName("New Circle Name");
        System.out.println(shapeService.getCircle().getName());
    }
}
