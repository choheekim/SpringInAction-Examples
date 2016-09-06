package com.chohee.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Chohee on 8/29/16.
 */

@Aspect
public class LoggingAspect {

    //specifying target for particular class/object
    @Before("execution(public String com.chohee.model.Circle.getName())")
    public void loggingAdviceForCircle() {

        System.out.println("Advice runs. Get Method called for Circle class");
    }

    @Before("execution(public String com.chohee.model.Triangle.getName())")
    public void loggingAdviceForTriangle() {
        System.out.println("Advice runs. Get Method called for Triangle class");
    }
}
