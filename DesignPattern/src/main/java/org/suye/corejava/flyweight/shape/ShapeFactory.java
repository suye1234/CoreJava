package org.suye.corejava.flyweight.shape;

import org.suye.corejava.flyweight.shape.service.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/21.
 */
public class ShapeFactory {
    private static Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String color) {
        if (shapes.containsKey(color)) {
            return shapes.get(color);
        } else {
            Shape cycle = new Cycle(color);
            shapes.put(color, cycle);

            return cycle;
        }

    }

    public static Integer getSum(){
        return shapes.size();
    }

}
