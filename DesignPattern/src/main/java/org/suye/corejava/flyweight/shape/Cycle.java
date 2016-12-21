package org.suye.corejava.flyweight.shape;

import org.suye.corejava.flyweight.shape.service.Shape;

/**
 * Created by Administrator on 2016/12/21.
 */
public class Cycle implements Shape {
    private String color;

    public Cycle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Draw a " + color + " cycle");
    }
}
