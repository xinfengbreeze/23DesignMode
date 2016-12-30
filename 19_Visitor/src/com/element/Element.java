package com.element;

import com.visitor.Visitor;

/**
 * User: kaifeng.yuan
 * Date: 12/27/16.
 */
public interface Element {
    void accept(Visitor visitor);
    String getName();
}

