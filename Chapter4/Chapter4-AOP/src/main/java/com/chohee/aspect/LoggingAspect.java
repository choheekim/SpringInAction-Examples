package com.chohee.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Chohee on 8/29/16.
 */

@Aspect
public class LoggingAspect {


    //Joinpoint has information of a method that triggers the advice
    @Before("allCircleMethods()")
    public void LoggingAdvice(JoinPoint joinPoint) {
        //getTarget() --> allows to access the object contains trigger method

    }

    @Before("args(name)")
    public void stringArgumentMethods(String name) {
        System.out.println("A method that takes String arguments has been called. The value is " + name);
    }






    @Pointcut("execution(* get*())")
    public void allGetters() {} //dummy method, which holds a pointcut expression

    @Pointcut("execution(* com.chohee.model.Circle.*(..))")
    public void allCircleMethods() {}

    @Pointcut("within(com.chohee.model.Triangle)")
    public void allTriangleMethods() {}

}
