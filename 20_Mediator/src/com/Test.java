package com;

/**
 * User: kaifeng.yuan
 * Date: 12/28/16.
 */
public class Test {
    public static void main(String[] args){
        LoginView view  = new LoginView();
        view.inputName("小花");
        view.inputPassword("123");
        view.login();


        view.registUser("小花","123");
        view.registUser("小明","666");
        view.registUser("Jack","456");

        view.inputName("小花");
        view.inputPassword("123");
        view.login();

        view.inputName("Jack");
        view.inputPassword("123");
        view.login();


    }

}
