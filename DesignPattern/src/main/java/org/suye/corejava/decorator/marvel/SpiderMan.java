package org.suye.corejava.decorator.marvel;

import org.suye.corejava.decorator.marvel.service.ISuperManBehavior;

/**
 * 类适配器模式，继承了被适配类，并实现目标方法。
 */
public class SpiderMan extends Person implements ISuperManBehavior {
    public SpiderMan(String name, Integer age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(getName() + " is flying....");
    }
}
