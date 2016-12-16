package com.car;

import com.engine.Engine;

/**
 * User: kaifeng.yuan
 * Date: 12/14/16.
 */
public interface ICar {
    public String getCarType();
    public String getCarEngine();
    public void setCarEngine(Engine engine);
    public void run();
}
