package com;

/**
 * User: kaifeng.yuan
 * Date: 12/28/16.
 */
public class LoginView implements View {
    String name;
    String password;
    Mediator mediator = new Mediator();
    {
        mediator.setView(this);
    }
    @Override
    public void loginResult(boolean result, String msg) {
        if(result){
            System.out.println("登录成功！"+msg);
        }else{
            System.out.println("登录失败！"+msg);
        }
    }

    public void inputPassword(String password){
        this.password = password;
    }

    public void inputName(String name){
        this.name = name;
    }

    public void login(){
        mediator.login(name,password);
    }

    public void registUser(String name,String password){
        mediator.register(name,password);
    }
}
