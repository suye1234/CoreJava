package org.suye.corejava.decorator.window;

import org.suye.corejava.decorator.window.service.Lcd;

/**
 * Created by Administrator on 2016/12/19.
 */
public class Window implements Lcd {
    @Override
    public void draw() {
        System.out.println("Draw a window..........");
    }
}
