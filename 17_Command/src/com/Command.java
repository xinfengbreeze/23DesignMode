package com;

/**
 * User: kaifeng.yuan
 * Date: 12/28/16.
 */
public interface Command {
    public void setReceiver(TV tv);

    public void execute();
}
