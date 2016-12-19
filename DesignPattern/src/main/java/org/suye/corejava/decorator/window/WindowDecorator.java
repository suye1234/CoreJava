package org.suye.corejava.decorator.window;

import org.suye.corejava.decorator.window.service.Lcd;

/**
 * Created by Administrator on 2016/12/19.
 */
public class WindowDecorator implements Lcd {
    private Lcd window;

    public WindowDecorator(Lcd window) {
        this.window = window;
    }

    @Override
    public void draw() {
        window.draw();
    }
}
