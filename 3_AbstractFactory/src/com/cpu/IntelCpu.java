package com.cpu;

import com.cpu.Cpu;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class IntelCpu implements Cpu {
    @Override
    public String getName() {
        return "com.cpu.IntelCpu";
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public int getPins() {
        return 200;
    }
}
