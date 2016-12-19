package org.suye.corejava.decorator.decorator;

import org.suye.corejava.decorator.decorator.service.Component;

/**
 * Created by Administrator on 2016/12/19.
 */
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();

        System.out.println("Print ConcreteDecorator2.............");
    }
}
