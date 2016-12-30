package com;

/**
 * User: kaifeng.yuan
 * Date: 12/30/16.
 */
public class Originator {
   private int  bloodValue ;//血量
    private int  magicValue;//魔法值
    private String environment;//环境，关卡

    private Memento memento;

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

    //保存游戏状态
    public Memento save(){
        return new Memento(bloodValue,magicValue,environment);
    }

    //恢复游戏状态
    public void restore(Memento memento){
        if(memento == null){
            return;
        }
        bloodValue = memento.getBloodValue();
        magicValue = memento.getMagicValue();
        environment = memento.getEnvironment();
    }

    public void show(){
        System.out.println("血量----"+bloodValue);
        System.out.println("魔法值----"+magicValue);
        System.out.println("环境变量---"+environment);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
