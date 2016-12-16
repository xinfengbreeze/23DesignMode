package com.adapter;

import com.current.ICurrent220V;
import com.current.ICurrent24V;
import com.current.impl.Current220V;

/**
 * User: kaifeng.yuan
 * Date: 12/13/16.
 */
public class CurrentAdapterB extends Current220V implements ICurrent24V {
    @Override
    public int getVoltage24V() {
        if (getVoltage220V()  == 220){
            System.out.println(getVoltage220V()+"V转化为"+24+"V");
            return 24;
        }else{
            System.out.println("适配器没有接电源！");
            return 0;
        }
    }

}
