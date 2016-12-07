package com.board;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class DellMainBoard implements MainBoard {
    @Override
    public String getName() {
        return "com.board.DellMainBoard";
    }

    @Override
    public int getPrice() {
        return 200;
    }

    @Override
    public int getCpuPins() {
        return 200;
    }

    @Override
    public int getGpuPins() {
        return 200;
    }
}
