package org.suye.corejava.adapter.shape;

/**
 * Created by suye on 2018/3/27.
 */
public class DrawObjectAdapter implements IDrawCircle{
    private DrawRectangle drawRectangle;

    public DrawObjectAdapter(DrawRectangle drawRectangle) {
        this.drawRectangle = drawRectangle;
    }

    @Override
    public void drawCircle() {
        drawRectangle.drawRectangle();

        System.out.printf("Draw circle finished....\r\n");
    }
}
