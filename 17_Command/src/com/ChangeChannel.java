package com;

/**
 * User: kaifeng.yuan
 * Date: 12/29/16.
 */
public class ChangeChannel implements Command{
    TV tv;
    int channel;
    @Override
    public void setReceiver(TV tv) {
        this.tv =tv;
    }

    @Override
    public void execute() {
        tv.changeChannel(channel);
    }

    public void setChannel(int channel){
        this.channel = channel;
    }
}
