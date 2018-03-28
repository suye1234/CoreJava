package org.suye.corejava.decorator.shape;

/**
 * Created by suye on 2018/3/27.
 */
public class YellowBackgroundDecorator extends ShapeDecorator {
    public YellowBackgroundDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.decoratorShape.draw();

        System.out.println("Background is yellow....");
    }
}
