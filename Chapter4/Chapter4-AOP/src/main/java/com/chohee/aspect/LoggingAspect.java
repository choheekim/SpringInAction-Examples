package com.chohee.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Chohee on 8/29/16.
 */

@Aspect
public class LoggingAspect {

    /**
    //specifying target for particular class/object
    @Before("execution(public String com.chohee.model.Circle.getName())")
    public void loggingAdviceForCircle() {

        System.out.println("Advice runs. Get Method called for Circle class");
    }

    @Before("execution(public String com.chohee.model.Triangle.getName())")
    public void loggingAdviceForTriangle() {
        System.out.println("Advice runs. Get Method called for Triangle class");
    }
    **/

    @Before("allGetters()")
    public void LoggingAdvice() {
        System.out.println("Advice runs. * Get* Method called.");
    }

    @Before("allCircleMethods()")
    public void LoggingAdviceForCircle() {
        System.out.println("Advice for all circle methods. One of the methods in circle get called");
    }

    @Before("allTriangleMethods()")
    public void  LoggingAdviceForTriangle() {
        System.out.println("Advice for all triangle methods. One of the methods in triangle get called");
    }


    @Pointcut("execution(* get*())")
    public void allGetters() {} //dummy method, which holds a pointcut expression

    @Pointcut("execution(* com.chohee.model.Circle.*(..))")
    public void allCircleMethods() {}

    @Pointcut("within(com.chohee.model.Triangle)")
    public void allTriangleMethods() {}

}
