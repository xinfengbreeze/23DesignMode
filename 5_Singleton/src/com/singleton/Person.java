package com.singleton;

/**
 * User: kaifeng.yuan
 * Date: 2/28/17.
 */
public class Person {
    private static Person person;
    private Person(){

    }

    public static Person getInstance(){
        if(person == null){
            synchronized (Person.class){
                if(person == null){
                    person = new Person();
                }
            }
        }
        return person;
    }
}
