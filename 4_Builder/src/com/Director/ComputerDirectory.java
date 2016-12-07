package com.Director;

import com.Builder.ComputerBuilder;
import com.computer.Computer;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class ComputerDirectory {
    public Computer buildComputer(ComputerBuilder builder){
        builder.setMainBoard();
        builder.setCpu();
        builder.setGpu();
        return builder.build();
    }
}
