package com;

import java.util.ArrayList;
import java.util.List;

/**
 * User: kaifeng.yuan
 * Date: 12/30/16.
 */
public class Caretaker {
    private int MAX  = 10;
    List<Memento> list;

    public void addMemento(Memento memento){
        if(list == null){
            list = new ArrayList<>();
        }
        if(list.size() > 10){
            list.remove(0);
        }
        list.add(memento);
    }

    public Memento getPreMemento(){
        if(list.size() ==0){
          return null;
        }
        return list.remove(list.size()-1);
    }
}
