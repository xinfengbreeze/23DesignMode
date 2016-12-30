package com.visitor;

import com.element.ElementA;
import com.element.ElementB;
import com.sun.tools.internal.ws.wsdl.framework.Elemental;

/**
 * User: kaifeng.yuan
 * Date: 12/27/16.
 */
public interface Visitor {
    void  visit(ElementA element);
    void  visit(ElementB element);
}
