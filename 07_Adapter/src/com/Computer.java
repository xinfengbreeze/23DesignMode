package com;

import com.current.ICurrent24V;

/**
 * User: kaifeng.yuan
 * Date: 12/13/16.
 */
public class Computer {

   private ICurrent24V current;

    public ICurrent24V getCurrent() {
        return current;
    }

    public void setCurrent(ICurrent24V current) {
        this.current = current;
    }

    //标准开机电压是24v
    public void startComputer(){
        if(current == null){
            System.out.println("没有电源开机失败！");
        }else{
            int voltage = current.getVoltage24V();
            if(voltage > 34){
                System.out.println(voltage+"V电压太高电脑损坏！");
            }else if(voltage < 20){
                System.out.println(voltage+"V电压太低开机失败！");
            }else{
                System.out.println(voltage+"V电压稳定开机成功！");
            }
        }
    }
}
