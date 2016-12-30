package com;

import java.util.HashMap;
import java.util.Map;

/**
 * User: kaifeng.yuan
 * Date: 12/28/16.
 */
public class Model {
    Map<String,String> userDataBase = new HashMap<>();
    public void addUser(String name,String password){
        userDataBase.put(name,password);
    }

    public boolean hasUser(String name,String password){
         if(userDataBase.containsKey(name)){
             return userDataBase.get(name).equals(password);
         }
         return false;
    }

}
