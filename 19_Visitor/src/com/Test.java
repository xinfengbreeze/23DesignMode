package com;

import com.element.Element;
import com.element.ElementA;
import com.element.ElementB;
import com.visitor.VisitorA;
import com.visitor.VisitorB;

/**
 * User: kaifeng.yuan
 * Date: 12/27/16.
 */
public class Test {
    public static void main(String[] args){
        ElementStruct struct = new ElementStruct();
        struct.addElement(new ElementA());
        struct.addElement(new ElementB());
        struct.addElement(new ElementA());
        struct.addElement(new ElementB());
        struct.addElement(new ElementB());
        struct.accept(new VisitorA());
        struct.accept(new VisitorB());
    }
}
