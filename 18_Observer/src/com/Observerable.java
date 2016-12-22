package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuankaifeng on 16/12/22.
 */
public class Observerable {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void brocastEvent(Event event){
        for (Observer observer:observers) {
            observer.onObserve(event);
        }
    }
}
