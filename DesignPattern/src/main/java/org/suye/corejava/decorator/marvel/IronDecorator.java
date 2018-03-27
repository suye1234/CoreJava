package org.suye.corejava.decorator.marvel;

import org.suye.corejava.decorator.marvel.service.IHumanBehavior;

/**
 * 对象适配器模式，包装了被适配类的实例，实现目标方法。
 */
public class IronDecorator extends SuperManDecorator{

    public IronDecorator(IHumanBehavior human) {
        super(human);
    }

    public void fly() {
        System.out.println("IronMan :" + ((Person)super.human).getName() + " is flying");
    }
}
