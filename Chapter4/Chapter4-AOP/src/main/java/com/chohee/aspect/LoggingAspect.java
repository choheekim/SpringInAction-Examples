package com.chohee.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Chohee on 8/29/16.
 */

@Aspect
public class LoggingAspect {

    @Before("execution(public String getName())")
    public void loggingAdvice() {
        System.out.println("Advice runs. Get Method called");
    }
}
