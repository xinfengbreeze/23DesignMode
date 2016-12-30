package com;

/**
 * User: kaifeng.yuan
 * Date: 12/28/16.
 */
public class Mediator {
    private View view;
    private Model userModel = new Model();
    public void register(String name ,String password){
        userModel.addUser(name,password);
    }
    public void login(String name, String password){
        if(userModel.hasUser(name,password)){
            view.loginResult(true,"欢迎用户"+name+"！");
        }else{
            view.loginResult(false,"用户名或者密码错误！");
        }
    }

    public void setView(View view){
        this.view = view;
    }
}
