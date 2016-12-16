package com.car.impl;

import com.car.ICar;
import com.engine.Engine;

/**
 * User: kaifeng.yuan
 * Date: 12/14/16.
 */
public class Jeep implements ICar {
    public Engine engine;
    @Override
    public String getCarType() {
        return "Jeep车";
    }

    @Override
    public String getCarEngine() {
        if(engine == null){
           return "没有发动机";
        }else{
            return engine.getDynamic();
        }
    }

    @Override
    public void setCarEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void run() {
        System.out.println(getCarType() + "-----发动机马力："+getCarEngine());
    }
}
