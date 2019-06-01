package com.livejq.aspectj_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 在此定义通知
 * 可以在xml中声明通知类型
 */
@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* com.livejq.aspectj_aop..*.*(..))")
    private void myPointCut(){}

    @Before(value = "myPointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.print("前置通知...");
        System.out.print(joinPoint.getTarget() + "目标方法名称:");
        System.out.println(joinPoint.getSignature().getName());
    }

    @AfterReturning(value="myPointCut()")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("后置通知...目标方法名称:" + joinPoint.getSignature().getName());
    }

    @Around(value="myPointCut()")
    public Object arount(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕开始...");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环绕结束");

        return obj;
    }

    @AfterThrowing(value="myPointCut()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("出错了..." + e.getMessage());
    }

    @After("myPointCut()")
    public void after() {
        System.out.println("最终通知！");
    }

}
