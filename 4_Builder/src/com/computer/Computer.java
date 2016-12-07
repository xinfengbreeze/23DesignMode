package com.computer;

import com.board.MainBoard;
import com.cpu.Cpu;
import com.gpu.Gpu;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public interface Computer {
    String getLogo();
    void setMainBoard(MainBoard mainBoard);
    MainBoard getMainBoard();
    void setCpu(Cpu cpu);
    Cpu getCpu();
    void setGpu(Gpu gpu);
    Gpu getGpu();
}
