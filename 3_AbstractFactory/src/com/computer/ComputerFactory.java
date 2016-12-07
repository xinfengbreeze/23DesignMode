package com.computer;

import com.board.MainBoard;
import com.cpu.Cpu;
import com.gpu.Gpu;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public interface ComputerFactory {
    MainBoard getMainBoard();
    Cpu getCpu();
    Gpu getGpu();
}
