package com;

import com.adapter.CurrentAdapter220To24V;
import com.adapter.CurrentAdapterB;
import com.current.impl.Current220V;

/**
 * User: kaifeng.yuan
 * Date: 12/13/16.
 */
public class Test {
    public static void main(String[] args){
        Computer computerA = new Computer();//电脑
        computerA.startComputer();//没有适配器开机
        CurrentAdapter220To24V adapterA = new CurrentAdapter220To24V();//适配器
        computerA.setCurrent(adapterA);//适配器连接电脑
        computerA.startComputer();//有适配器开机  适配器未接电
        adapterA.setCurrent(new Current220V());//适配器接电
        computerA.startComputer();//电脑连接适配器 适配器连接220v电源 开机


        Computer computerB = new Computer();//电脑
        computerB.setCurrent(new CurrentAdapterB());
        computerB.startComputer();
    }
}
