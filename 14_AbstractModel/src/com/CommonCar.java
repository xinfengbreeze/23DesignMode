package com;

/**
 * Created by yuankaifeng on 16/12/20.
 */
public class CommonCar extends Car {
    @Override
    public void makeEngine() {
        System.out.println("普通发动机");
    }

    @Override
    public void makeWheel() {
        System.out.println("普通的轮胎");
    }
}
