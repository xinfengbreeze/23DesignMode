package com.adapter;

import com.current.ICurrent220V;
import com.current.ICurrent24V;

/**
 * User: kaifeng.yuan
 * Date: 12/13/16.
 */
public class CurrentAdapter220To24V implements ICurrent24V {
    private ICurrent220V current;
    @Override
    public int getVoltage24V() {
        if (current !=null){
            System.out.println(current.getVoltage220V()+"V转化为"+24+"V");
            return 24;
        }else{
            System.out.println("适配器没有接电源！");
            return 0;
        }

    }

    public void setCurrent(ICurrent220V current){
        this.current = current;
    }
}
