package com.Builder;

import com.computer.Computer;

/**
 * User: kaifeng.yuan
 * Date: 12/6/16.
 */
public interface ComputerBuilder {
    void setMainBoard();
    void setCpu();
    void setGpu();
    Computer build();
}
