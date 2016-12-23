package com;

/**
 * User: kaifeng.yuan
 * Date: 12/23/16.
 */
public class Context {
    public  void step1(){
        System.out.println("计算步骤----- 1");
    }

    public  void step2(){
        System.out.println("计算步骤----- 2");
    }

    public  void operate(Strategy strategy){
       step1();
        step2();
        strategy.strategy();
    }
}
