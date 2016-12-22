package com;

/**
 * Created by yuankaifeng on 16/12/22.
 */
public class Test {
    public static void main(String[] args){
        Observerable observerable = new Observerable();
        observerable.addObserver(new ObserverA());
        observerable.addObserver(new ObserverB());
        observerable.addObserver(new ObserverA());
        Event event = new Event();
        event.type = 88;
        event.msg ="明天晴天";
        observerable.brocastEvent(event);
    }
}
