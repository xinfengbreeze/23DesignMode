package com;

import com.proxy.CglibProxy;
import com.proxy.JavaProxy;
import com.proxy.WorkerStaticProxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.util.Date;

/**
 * User: kaifeng.yuan
 * Date: 12/19/16.
 */
public class Test {
    public static void main(String[] args){
        IWorker worker = new WorkerStaticProxy(new Worker());
        worker.work();

//        IWorker worker1 = new Worker();
//
//        IWorker workerDynamicWorker = (IWorker) Proxy.newProxyInstance(Worker.class.getClassLoader(), Worker.class.getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("java 的proxy动态代理  "+new Date().toLocaleString());
//                Object object = method.invoke(worker1);
//                System.out.println("java 的proxy动态代理  "+new Date().toLocaleString());
//                return object;
//            }
//        });
//        workerDynamicWorker.work();
        IWorker worker1 = (IWorker) new JavaProxy().getInstance(new Worker());
        worker1.work();;

//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(Worker.class);
//        enhancer.setCallback(new MethodInterceptor() {
//            @Override
//            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//                System.out.println("cglib 的proxy动态代理  "+new Date().toLocaleString());
//                methodProxy.invokeSuper(o,objects);
//                System.out.println("cglib 的proxy动态代理  "+new Date().toLocaleString());
//                return null;
//            }
//        });
//        IWorker worker3 = (IWorker) enhancer.create();
//        worker3.work();
        IWorker worker3 = (IWorker) new CglibProxy().getInstance(Worker.class);
        worker3.work();
    }
}
