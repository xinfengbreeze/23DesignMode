package com;

/**
 * User: kaifeng.yuan
 * Date: 12/23/16.
 */
public class Test {

    public static void main(String[] args){
        Context context = new Context();
        context.operate(new StrategyA());
        System.out.println("----------------------");
        context.operate(new StrategyB());
    }
}
