package com;

import com.car.ICar;
import com.car.impl.Bus;
import com.car.impl.Jeep;
import com.engine.Engine360;
import com.engine.Engine600;

/**
 * User: kaifeng.yuan
 * Date: 12/14/16.
 */
public class Test {
    public static void main(String[] args){
        ICar bus = new Bus();
        bus.setCarEngine(new Engine600());
        bus.run();

        ICar busB = new Bus();
        busB.setCarEngine(new Engine360());
        busB.run();

        ICar jeep = new Jeep();
        jeep.setCarEngine(new Engine360());
        jeep.run();

        ICar jeepB = new Jeep();
        jeepB.setCarEngine(new Engine600());
        jeepB.run();
    }
}
