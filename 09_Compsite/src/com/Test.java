package com;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sun.jvm.hotspot.utilities.BitMap;

/**
 * User: kaifeng.yuan
 * Date: 12/15/16.
 */
public class Test {

    public static void main(String[] args){
        Component tree = new Composite();
        tree.name = "树根";

        Component branchA = new Composite();
        branchA.name = "树枝A";
        branchA.setParent(tree);

        Component branchB = new Composite();
        branchB.name ="树枝B";
        tree.addChild(branchB);

        Component branchC = new Composite();
        branchC.name = "树枝C";
        branchC.setParent(tree);

        Component leaf1 = new Leaf();
        leaf1.name="叶子 1";
        leaf1.setParent(branchA);
        Component leaf2 = new Leaf();
        leaf2.name="叶子 2";
        leaf2.setParent(branchA);
        Component leaf3 = new Leaf();
        leaf3.name="叶子 3";
        leaf3.setParent(branchA);
        Component leaf4 = new Leaf();
        leaf4.name="叶子 4";
        leaf4.setParent(branchA);

        tree.transportWater();
        System.out.println("------------------------\n");
        tree.compoundOxygen();
        System.out.println("------------------------\n");
        branchA.transportWater();
        System.out.println("------------------------\n");
        branchB.transportWater();
        System.out.println("------------------------\n");
        leaf3.setParent(branchB);
        branchB.addChild(leaf4);
        System.out.println("------------------------\n");
        branchA.transportWater();
        System.out.println("------------------------\n");
        branchB.transportWater();
        System.out.println("------------------------\n");

        branchA.addChild(branchB);
        System.out.println("------------------------\n");
        branchA.transportWater();
        System.out.println("------------------------\n");
        tree.transportWater();
    }
}
