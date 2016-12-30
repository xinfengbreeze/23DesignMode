package com;

import com.element.Element;
import com.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * User: kaifeng.yuan
 * Date: 12/27/16.
 */
public class ElementStruct {
    List<Element> list = new ArrayList<>();
    void addElement(Element element){
        list.add(element);
    }
    void removeElement(Element element){
        if(list.contains(element)){
            list.remove(element);
        }
    }

    void accept(Visitor visitor){
        for(Element e : list){
            e.accept(visitor);
        }
    }
}
