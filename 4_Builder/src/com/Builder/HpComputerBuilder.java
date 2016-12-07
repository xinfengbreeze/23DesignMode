package com.Builder;

import com.board.DellMainBoard;
import com.board.HpMainBoard;
import com.computer.Computer;
import com.computer.DellComputer;
import com.computer.HpComputer;
import com.cpu.AmdCpu;
import com.cpu.IntelCpu;
import com.gpu.AmdGpu;
import com.gpu.InvdGpu;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class HpComputerBuilder implements  ComputerBuilder{
    Computer computer = new HpComputer();
    @Override
    public void setMainBoard() {
        computer.setMainBoard(new HpMainBoard());
    }

    @Override
    public void setCpu() {
        computer.setCpu(new AmdCpu());
    }

    @Override
    public void setGpu() {
        computer.setGpu(new AmdGpu());
    }

    @Override
    public Computer build() {
        return computer;
    }
}
