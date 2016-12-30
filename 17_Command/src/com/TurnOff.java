package com;

/**
 * User: kaifeng.yuan
 * Date: 12/29/16.
 */
public class TurnOff implements Command {
    TV tv;
    @Override
    public void setReceiver(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
