package com.livejq.jdk_proxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class MyBeanFactory {

    public static UserDao getBean() {
        final UserDao userDao = new UserDaoImpl();
        final MyAspect myAspect = new MyAspect();

        return (UserDao) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(),
                new Class[] {UserDao.class},
                new InvocationHandler() {

                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        myAspect.before();
                        Object obj = method.invoke(userDao, objects);
                        myAspect.after();
                        return obj;
                    }
                });
    }
}
