package org.suye.corejava.decorator.decorator;

import org.suye.corejava.decorator.decorator.service.Component;

/**
 * Created by Administrator on 2016/12/19.
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
