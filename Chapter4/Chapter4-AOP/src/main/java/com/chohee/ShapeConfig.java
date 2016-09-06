package com.chohee;

import com.chohee.aspect.LoggingAspect;
import com.chohee.model.Circle;
import com.chohee.model.Triangle;
import com.chohee.service.ShapeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Chohee on 8/29/16.
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ShapeConfig {

    @Bean
    public ShapeService shapeService() {
        return new ShapeService();
    }

    @Bean
    public Circle circle() {
        return new Circle();
    }

    @Bean
    public Triangle triangle() {
        return new Triangle();
    }

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }


}
