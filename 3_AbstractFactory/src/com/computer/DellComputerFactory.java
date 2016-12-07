package com.computer;

import com.board.DellMainBoard;
import com.board.MainBoard;
import com.cpu.Cpu;
import com.cpu.IntelCpu;
import com.gpu.AmdGpu;
import com.gpu.Gpu;
import com.gpu.InvdGpu;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class DellComputerFactory implements  ComputerFactory{
    @Override
    public MainBoard getMainBoard() {
        return new DellMainBoard();
    }

    @Override
    public Cpu getCpu() {
        return new IntelCpu();
    }

    @Override
    public Gpu getGpu() {
        return new InvdGpu();
    }
}
