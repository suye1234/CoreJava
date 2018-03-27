package org.suye.corejava.decorator.marvel;

import org.suye.corejava.decorator.marvel.service.IHumanBehavior;

/**
 * Created by suye on 2018/3/27.
 */
public class SuperManDecorator implements IHumanBehavior {
    protected IHumanBehavior human;

    public SuperManDecorator(IHumanBehavior human) {
        this.human = human;
    }

    @Override
    public void run() {
        human.run();
    }

    @Override
    public void speak() {
        human.speak();
    }

    @Override
    public void listen() {
        human.listen();
    }
}
