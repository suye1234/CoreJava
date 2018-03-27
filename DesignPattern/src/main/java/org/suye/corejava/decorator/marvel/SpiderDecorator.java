package org.suye.corejava.decorator.marvel;

import org.suye.corejava.decorator.marvel.service.IHumanBehavior;

/**
 * 类适配器模式，继承了被适配类，并实现目标方法。
 */
public class SpiderDecorator extends SuperManDecorator {
    public SpiderDecorator(IHumanBehavior human) {
        super(human);
    }

    public void climb(){
        System.out.println("SpiderMan: " + ((Person)super.human).getName()  + " is climbing.....");

    }
}
