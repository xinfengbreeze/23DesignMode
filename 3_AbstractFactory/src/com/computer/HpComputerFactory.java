package com.computer;

import com.board.DellMainBoard;
import com.board.MainBoard;
import com.cpu.AmdCpu;
import com.cpu.Cpu;
import com.gpu.AmdGpu;
import com.gpu.Gpu;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class HpComputerFactory implements ComputerFactory {
    @Override
    public MainBoard getMainBoard() {
        return new DellMainBoard();
    }

    @Override
    public Cpu getCpu() {
        return new AmdCpu();
    }

    @Override
    public Gpu getGpu() {
        return new AmdGpu();
    }
}
