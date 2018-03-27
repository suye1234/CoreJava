package org.suye.corejava.decorator.shape;

/**
 * Created by suye on 2018/3/27.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw(){
        decoratorShape.draw();
    }
}
