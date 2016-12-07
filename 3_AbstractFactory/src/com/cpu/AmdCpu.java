package com.cpu;

import com.cpu.Cpu;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class AmdCpu implements Cpu {
    @Override
    public String getName() {
        return "com.cpu.AmdCpu";
    }

    @Override
    public int getPrice() {
        return 88;
    }

    @Override
    public int getPins() {
        return 300;
    }
}
