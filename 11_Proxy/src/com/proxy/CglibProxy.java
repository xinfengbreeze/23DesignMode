package com.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * User: kaifeng.yuan
 * Date: 12/20/16.
 */
public class CglibProxy implements MethodInterceptor {
    public Object getInstance(Class clazz){
        Enhancer enhance = new Enhancer();
        enhance.setSuperclass(clazz);
        enhance.setCallback(this);
        return enhance.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 的proxy动态代理  "+new Date().toLocaleString());
         Object obj = methodProxy.invokeSuper(o,objects);
        System.out.println("cglib 的proxy动态代理  "+new Date().toLocaleString());
        return obj;
    }
}
