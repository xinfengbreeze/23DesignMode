package com.gpu;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class InvdGpu implements  Gpu {
    @Override
    public String getName() {
        return "InvdGpu";
    }

    @Override
    public int getPrice() {
        return 200;
    }

    @Override
    public int getPins() {
        return 200;
    }
}
