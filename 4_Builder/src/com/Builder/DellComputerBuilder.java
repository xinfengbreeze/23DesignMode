package com.Builder;

import com.board.DellMainBoard;
import com.computer.Computer;
import com.computer.DellComputer;
import com.cpu.IntelCpu;
import com.gpu.InvdGpu;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public class DellComputerBuilder  implements  ComputerBuilder{
    Computer computer = new DellComputer();
    @Override
    public void setMainBoard() {
        computer.setMainBoard(new DellMainBoard());
    }

    @Override
    public void setCpu() {
        computer.setCpu(new IntelCpu());
    }

    @Override
    public void setGpu() {
        computer.setGpu(new InvdGpu());
    }

    @Override
    public Computer build() {
        return computer;
    }
}
