package org.suye.corejava.decorator.window;

import org.suye.corejava.decorator.window.service.Lcd;

/**
 * Created by Administrator on 2016/12/19.
 */
public class Border extends WindowDecorator {

    public Border(Lcd window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();

        System.out.println("Add a border for window.....");
    }
}
