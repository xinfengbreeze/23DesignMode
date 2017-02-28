package com.singleton;

import com.singleton.EasySingleton;
import com.singleton.Worker;

/**
 * User: kaifeng.yuan
 * Date: 2/28/17.
 */
public class Test {

    public static void main(String[] args){
        Worker worker =  EasySingleton.INSTNCE.getInstance();
    }


}
