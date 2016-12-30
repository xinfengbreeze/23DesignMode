package com;

/**
 * User: kaifeng.yuan
 * Date: 12/30/16.
 */
public class Memento {
    private int  bloodValue ;//血量
    private int  magicValue;//魔法值
    private String environment;//环境，关卡

    private Memento(){

    }
    public Memento(int bloodValue, int magicValue, String environment) {
        this.bloodValue = bloodValue;
        this.magicValue = magicValue;
        this.environment = environment;
    }

    public int getBloodValue() {
        return bloodValue;
    }

    public void setBloodValue(int bloodValue) {
        this.bloodValue = bloodValue;
    }

    public int getMagicValue() {
        return magicValue;
    }

    public void setMagicValue(int magicValue) {
        this.magicValue = magicValue;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}

