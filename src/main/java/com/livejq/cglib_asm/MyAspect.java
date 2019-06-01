package com.livejq.cglib_asm;

public class MyAspect {
    public void before() {
        System.out.println("在目标方法调用前（前增强）！");
    }

    public void after() {
        System.out.println("在目标方法调用后（后增强）！\n");
    }
}
