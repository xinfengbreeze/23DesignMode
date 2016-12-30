package com;

/**
 * User: kaifeng.yuan
 * Date: 12/29/16.
 */
public class CommandInvoker {
    private TV tv;
    private TurnOn turnOn;
    private TurnOff turnOff;
    private ChangeChannel changeChannel;
    public CommandInvoker(){
        this.turnOff = new TurnOff();
        this.turnOn = new TurnOn();
        this.changeChannel = new ChangeChannel();
    }

    public void setReceiver(TV tv){
        this.tv= tv;
    }

    public void turnOn(){
        turnOn.setReceiver(tv);
        turnOn.execute();
    }

    public void turnOff(){
        turnOff.setReceiver(tv);
        turnOff.execute();
    }

    public void changeChannel(int channel){
        changeChannel.setReceiver(tv);
        changeChannel.setChannel(channel);
        changeChannel.execute();

    }
}
