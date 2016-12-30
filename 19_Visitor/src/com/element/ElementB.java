package com.element;

import com.visitor.Visitor;

/**
 * User: kaifeng.yuan
 * Date: 12/27/16.
 */
public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return "元素B";
    }
}
