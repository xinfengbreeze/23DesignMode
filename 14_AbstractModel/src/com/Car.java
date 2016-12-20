package com;

/**
 * Created by yuankaifeng on 16/12/20.
 */
public abstract class Car {
    //基本方法
    public abstract void makeEngine();
    public abstract void makeWheel();

    //模板方法
    public void makePreDrive(){
        System.out.println("设置汽车前驱动力");
    }

    public  final void assembleCar(){
        System.out.println("------开始组装汽车-----");
        makeEngine();
        makeWheel();
        makePreDrive();
        if(isHighVersion()){
            makePostDrive();
        }
    }

    public void makePostDrive(){
        System.out.println("设置汽车后驱动力");
    }

    //钩子方法
    public boolean isHighVersion(){
        return false;
    }
}
