package com;

/**
 * Created by yuankaifeng on 16/12/20.
 */
public class JeepCar extends  Car {
    @Override
    public void makeEngine() {
        System.out.println("Jeep发动机");
    }

    @Override
    public void makeWheel() {
        System.out.println("Jeep轮胎");
    }

    @Override
    public boolean isHighVersion(){
        return true;
    }
}
