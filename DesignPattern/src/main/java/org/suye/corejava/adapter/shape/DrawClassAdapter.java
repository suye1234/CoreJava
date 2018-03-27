package org.suye.corejava.adapter.shape;

/**
 * Created by suye on 2018/3/27.
 */
public class DrawClassAdapter extends DrawRectangle implements IDrawCircle {
    @Override
    public void drawCircle() {
        super.drawRectangle();

        System.out.printf("Draw circle finished..\r\n");
    }
}
