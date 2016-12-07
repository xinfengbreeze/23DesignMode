package com.computer;

import com.board.MainBoard;
import com.cpu.Cpu;
import com.gpu.Gpu;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class DellComputer implements  Computer {
    private String logo  = "DELL";
    private MainBoard mainBoard;
    private Gpu gpu;
    private Cpu cpu;

    @Override
    public MainBoard getMainBoard() {
        return mainBoard;
    }

    @Override
    public Cpu getCpu() {
        return cpu;
    }

    @Override
    public Gpu getGpu() {
        return gpu;
    }

    @Override
    public String getLogo() {
        return logo;
    }

    @Override
    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }
    @Override
    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }
    @Override
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
