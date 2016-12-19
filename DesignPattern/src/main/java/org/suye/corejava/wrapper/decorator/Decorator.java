package org.suye.corejava.wrapper.decorator;

import org.suye.corejava.wrapper.decorator.service.Component;

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
