package com;

import java.util.ArrayList;
import java.util.List;

/**
 * User: kaifeng.yuan
 * Date: 12/14/16.
 */
public class Composite extends  Component {
    private Component parent;
    List<Component> components = new ArrayList<>();
    @Override
    public void transportWater() {

        System.out.println("Composite-"+name + "--运输水分");
        for (Component child:components) {
           child.transportWater();
        }
    }

    @Override
    public void compoundOxygen() {
        for (Component child:components) {
           child.compoundOxygen();
        }
    }

    @Override
    public void addChild(Component child) {
        if(!components.contains(child)){
            components.add(child);
            child.setParent(this);
        }
    }

    @Override
    public void removeChild(Component child) {
        if(components.contains(child)){
            components.remove(child);
            child.setParent(null);
        }
    }

    @Override
    public void eachChild() {
        for (Component child:components) {
            System.out.println("   child--"+child.name);
        }
    }

    @Override
    public void setParent(Component parent) {
        if(parent != null){
            removeParent();
            parent.addChild(this);
        }
        this.parent = parent;
    }

    @Override
    public void removeParent() {
        if(this.parent !=null){
            parent.removeChild(this);
        }
    }

    @Override
    public Component getParent() {
        return parent;
    }
}
