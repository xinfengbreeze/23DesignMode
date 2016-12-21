package com;

/**
 * User: kaifeng.yuan
 * Date: 12/20/16.
 */
public class ModuleHamburger {
    public void makeBread(){
        System.out.println("做汉堡面包");
    }

    public void makeMeat(){
        System.out.println("做汉堡肉");
    }

    public void makeHamburger(){
        makeBread();
        makeMeat();
        System.out.println("做汉堡面包");
    }
}
