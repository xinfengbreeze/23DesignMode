package com.singleton;

/**
 * User: kaifeng.yuan
 * Date: 2/28/17.
 */
public class Student {
    private static Student  student= new Student();
    private Student(){

    }
    public Student getInstance(){
        return  student;
    }
}
