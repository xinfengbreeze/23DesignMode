package com.singleton;

/**
 * User: kaifeng.yuan
 * Date: 2/28/17.
 */
public enum EasySingleton {
    INSTNCE;
    private Worker worker;
    private EasySingleton(){
        worker = new Worker();
    }
    public Worker getInstance(){
        return worker;
    }
}
