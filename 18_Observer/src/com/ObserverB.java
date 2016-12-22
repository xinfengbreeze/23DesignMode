package com;

/**
 * Created by yuankaifeng on 16/12/22.
 */
public class ObserverB implements Observer{

    @Override
    public void onObserve(Event event) {
        System.out.println("观察则B------收到事件----"+event.type+"----"+event.msg);
    }
}
