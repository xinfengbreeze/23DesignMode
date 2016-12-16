package com;

/**
 * User: kaifeng.yuan
 * Date: 12/14/16.
 */
public abstract class Component {
    //公共的属性
    public String name;
    //公共的行为
    public abstract  void transportWater();//运输水分
    public abstract  void compoundOxygen();//合成氧气

    //管理子节点的
    public abstract  void addChild(Component child);
    public abstract  void removeChild(Component child);
    public abstract  void eachChild();

    //管理父节点的方法  （实际使用的时候 是可选的，不一定有）
    public abstract void setParent(Component parent);
    public abstract void removeParent();
    public abstract Component getParent();

}
