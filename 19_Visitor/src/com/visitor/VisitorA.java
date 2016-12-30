package com.visitor;

import com.element.ElementA;
import com.element.ElementB;

/**
 * User: kaifeng.yuan
 * Date: 12/27/16.
 */
public class VisitorA implements  Visitor {
    @Override
    public void visit(ElementA element) {
        System.out.println(this.getClass().getName() +"能访问"+element.getClass().getName());
    }

    @Override
    public void visit(ElementB element) {

    }
}
