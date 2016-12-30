package com;

/**
 * User: kaifeng.yuan
 * Date: 12/29/16.
 */
public class Test {
    public static void main(String[] args){
        TV tv = new TV();
        CommandInvoker yaokong = new CommandInvoker();
        yaokong.setReceiver(tv);
        yaokong.turnOn();
        yaokong.changeChannel(6);
        yaokong.changeChannel(0);
        yaokong.turnOff();
    }
}
