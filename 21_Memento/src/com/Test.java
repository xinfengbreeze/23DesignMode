package com;

/**
 * User: kaifeng.yuan
 * Date: 12/30/16.
 */
public class Test {
    public static void main(String[] args){
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setBloodValue(100);
        originator.setMagicValue(100);
        originator.setEnvironment("第一关开始位置");
        originator.show();

        //经过激烈的战斗来到了 第一关的BOSS面前

        originator.setBloodValue(50);
        originator.setMagicValue(40);
        originator.setEnvironment("第一关BOSS前");
        originator.show();

        caretaker.addMemento(originator.save());

        //经过激烈的战斗来到了 第二关的开始位置

        originator.setBloodValue(100);
        originator.setMagicValue(100);
        originator.setEnvironment("第二关开始位置");
        originator.show();
        caretaker.addMemento(originator.save());


        //经过激烈的战斗来到了 第二关的开始位置

        originator.setBloodValue(0);
        originator.setMagicValue(0);
        originator.setEnvironment("第二关中途失败了！");
        originator.show();


        //恢复保存
        originator.restore(caretaker.getPreMemento());
        originator.show();

        originator.restore(caretaker.getPreMemento());
        originator.show();
    }
}
