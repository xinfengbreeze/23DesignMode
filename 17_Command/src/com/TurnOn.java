package com;

/**
 * User: kaifeng.yuan
 * Date: 12/28/16.
 */
public class TurnOn implements  Command{
    TV tv;
    @Override
    public void setReceiver(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
