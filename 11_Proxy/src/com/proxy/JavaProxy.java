package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * User: kaifeng.yuan
 * Date: 12/20/16.
 */
public class JavaProxy  implements InvocationHandler{
    private Object object;
    public Object getInstance(Object object){
        this.object = object;
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("java 的proxy动态代理  "+new Date().toLocaleString());
        Object res = method.invoke(object,args);
        System.out.println("java 的proxy动态代理  "+new Date().toLocaleString());
        return res;
    }
}
