package com;

/**
 * Created by yuankaifeng on 16/12/20.
 */
public class Test {
    public static final void main(String[] args){
        Car commonCar = new CommonCar();
        commonCar.assembleCar();

        Car jeepCar = new JeepCar();
        jeepCar.assembleCar();
    }
}
