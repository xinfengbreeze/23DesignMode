package com;

import java.util.Random;

/**
 * User: kaifeng.yuan
 * Date: 12/19/16.
 */
public class Worker implements IWorker {

    @Override
    public void work() {
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("工人工作。。。");
    }
}
