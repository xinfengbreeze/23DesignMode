package com;

/**
 * User: kaifeng.yuan
 * Date: 12/14/16.
 */
public class Leaf extends Component {
    private Component parent;
    @Override
    public void transportWater() {
        System.out.println("   Leaf-"+name + "--运输水分");
    }

    @Override
    public void compoundOxygen() {
        System.out.println("   Leaf-"+name + "--合成氧气");
    }

    @Override
    public void addChild(Component component) {

    }

    @Override
    public void removeChild(Component component) {

    }

    @Override
    public void eachChild() {

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
        if(parent != null){
            this.parent.removeChild(this); //从父节点中移除自己
        }
    }

    @Override
    public Component getParent() {
        return parent;
    }
}
