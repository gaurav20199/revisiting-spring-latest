package com.spring_revisit_latest.spring_learning.step7aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarAspectForAnnotations {
    // Don't use advice annotations other than around with proceeding join point. Aspect itslef will not be called.
    @AfterReturning("@annotation(ToModify)")
    public void loggingBeforeReturningModifyPrice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("After returning modification");
        joinPoint.proceed();
    }

    @Before("@annotation(ToModify)")
    public void loggingBeforeModifyPrice()  {
        System.out.println("Before modification");
    }

    @After("@annotation(ToModify)")
    public void loggingAfterModifyPrice() {
        System.out.println("After modification");
    }
}
