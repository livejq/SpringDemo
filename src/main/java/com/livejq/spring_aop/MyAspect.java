package com.livejq.spring_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法执行前...");
        Object obj = methodInvocation.proceed();
        System.out.println("方法执行后...");
        return obj;
    }
}
