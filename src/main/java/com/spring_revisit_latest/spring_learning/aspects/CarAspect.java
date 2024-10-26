package com.spring_revisit_latest.spring_learning.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarAspect {
//    @Around("execution(* com.spring_revisit_latest.spring_learning.step7.example1.*.getPrice(..))")
//    public Object interruptGetPrice(ProceedingJoinPoint joinPoint) {
//        System.out.println("Aspect Executed");
//        String modifiedReturnedValue = null;
//        try {
//            Object returnedValue = joinPoint.proceed();
//            System.out.println("returnedValue is::"+returnedValue);
//            System.out.println("Aspect modified the value");
//            modifiedReturnedValue = "20";
//        }catch (Throwable e) {
//            System.out.println("Exception occurred");
//        }
//        return modifiedReturnedValue;
//    }

    @Around("execution(* com.spring_revisit_latest.spring_learning.step7.example1.*.*(..))")
    public Object interruptAll(ProceedingJoinPoint joinPoint) {
        System.out.println("Aspect Executed");
        String modifiedReturnedValue = null;
        try {
            Object returnedValue = joinPoint.proceed();
            System.out.println("returnedValue is::"+returnedValue);
            System.out.println("Aspect modified the value");
            modifiedReturnedValue = "20";
        }catch (Throwable e) {
            System.out.println("Exception occurred");
        }
        return modifiedReturnedValue;
    }

    @Around("execution(* com.spring_revisit_latest.spring_learning.step7.example1.*.getModifiedPrice(..))")
    public void aspectOverModifiedPrice(ProceedingJoinPoint joinPoint) {
        System.out.println("Aspect Executed for modified price");
        try {
            Object[] newArgs = {"3500"};
            joinPoint.proceed(newArgs);
        }catch (Throwable e) {
            System.out.println("Exception occurred");
        }
    }
}
