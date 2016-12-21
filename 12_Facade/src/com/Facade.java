package com;

import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * User: kaifeng.yuan
 * Date: 12/21/16.
 */
public class Facade {
    ModuleChips chips = new ModuleChips();
    ModuleCola  cola = new ModuleCola();
    ModuleHamburger hamburger = new ModuleHamburger();
    public void getCookCola(){
     cola.makeCookCola();
    }

    public void getPeisiCola(){
        cola.makePeisiCola();
    }

    public void getChips(){
        chips.makeChips();
    }

    public void getHamburger(){
        hamburger.makeHamburger();
    }

    public void makeTaoCan(){
         cola.makeCookCola();
         chips.makeChips();
         hamburger.makeHamburger();
     }
}
