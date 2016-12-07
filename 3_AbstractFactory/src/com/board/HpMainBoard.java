package com.board;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class HpMainBoard implements MainBoard {
    @Override
    public String getName() {
        return "HpMainBoard";
    }

    @Override
    public int getPrice() {
        return 300;
    }

    @Override
    public int getCpuPins() {
        return 300;
    }

    @Override
    public int getGpuPins() {
        return 300;
    }
}
