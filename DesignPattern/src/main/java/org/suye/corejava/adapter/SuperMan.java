package org.suye.corejava.adapter;

import org.suye.corejava.adapter.service.ISuperManBehavior;

/**
 * 类适配器模式，继承了被适配类，并实现目标方法。
 */
public class SuperMan extends Person implements ISuperManBehavior {
    public SuperMan(String name, Integer age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(getName() + " is flying....");
    }
}
