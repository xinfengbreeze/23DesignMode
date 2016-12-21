package com;

/**
 * User: kaifeng.yuan
 * Date: 12/21/16.
 */
public class ModuleChips {

    public void chipPotato(){
        System.out.println("切土豆条");
    }

    public void  fryChips(){
        System.out.println("炸薯条");
    }

    public void makeChips(){
        chipPotato();
        fryChips();
    }
}
