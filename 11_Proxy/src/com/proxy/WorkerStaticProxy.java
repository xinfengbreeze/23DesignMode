package com.proxy;

import com.IWorker;

import java.util.Date;

/**
 * User: kaifeng.yuan
 * Date: 12/19/16.
 */
public class WorkerStaticProxy  implements IWorker{
    private IWorker worker;
    public WorkerStaticProxy(IWorker worker){
        this.worker = worker;
    }
    @Override
    public void work() {
        System.out.println(new Date().toLocaleString());
        worker.work();
        System.out.println(new Date().toLocaleString());
    }
}
