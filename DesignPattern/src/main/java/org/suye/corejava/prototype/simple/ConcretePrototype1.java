package org.suye.corejava.prototype.simple;

import org.suye.corejava.prototype.simple.service.SimplePrototype;

/**
 * Created by Administrator on 2016/12/14.
 */
public class ConcretePrototype1 implements SimplePrototype {

    public SimplePrototype clone() {
        System.out.println("New ConcretePrototype1........");

        return new ConcretePrototype1();
    }
}
