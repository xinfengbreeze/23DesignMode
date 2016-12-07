package com.gpu;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class AmdGpu implements Gpu {
    @Override
    public String getName() {
        return "AmdGpu";
    }

    @Override
    public int getPrice() {
        return 300;
    }

    @Override
    public int getPins() {
        return 300;
    }
}
