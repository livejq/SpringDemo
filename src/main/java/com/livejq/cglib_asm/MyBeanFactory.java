package com.livejq.cglib_asm;

import org.springframework.cglib.proxy.Enhancer;

/**
 * Spring 4.x 文档中并没有给出，由于其对CGLIB3.2 重新打包，仅供内部使用，
 * 防止其与框架或第三方包发生潜在的依赖冲突
 */
public class MyBeanFactory {
    final BookDao bookDao = new BookDao();
    final MyAspect myAspect = new MyAspect();
    Enhancer enhancer = new Enhancer();
}
