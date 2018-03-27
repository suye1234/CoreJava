package org.suye.corejava.decorator.shape;

/**
 * Created by suye on 2018/3/27.
 */
public class RedBorderDecorator extends ShapeDecorator {
    public RedBorderDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }


    @Override
    public void draw() {
        super.decoratorShape.draw();

        System.out.println("Border is red....\r\n");
    }
}
