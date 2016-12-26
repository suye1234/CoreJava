package org.suye.corejava.flyweight;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.flyweight.flyweight.FlyweightFactory;
import org.suye.corejava.flyweight.flyweight.service.Flyweight;
import org.suye.corejava.flyweight.shape.ShapeFactory;
import org.suye.corejava.flyweight.shape.service.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/21.
 */
public class FlyweightTest {
    @Test
    public void testFlyWeight() {
        Flyweight flyweight1 = FlyweightFactory.getFlyWeight("ABC");

        Flyweight flyweight2 = FlyweightFactory.getFlyWeight("ABC");

        flyweight1.print("Test 1");
        flyweight2.print("Test 2");

        Assert.assertTrue(flyweight1 == flyweight2);

        List<String> extrinsicStates = new ArrayList<>();

        extrinsicStates.add("AAA");
        extrinsicStates.add("BBB");
        extrinsicStates.add("CCC");
        extrinsicStates.add("AAA");
        extrinsicStates.add("BBB");

        Flyweight unsharedFlyweight1 = FlyweightFactory.getFlyWeight(extrinsicStates);

        Flyweight unsharedFlyweight2 = FlyweightFactory.getFlyWeight(extrinsicStates);

        unsharedFlyweight1.print("Test 3");
        unsharedFlyweight2.print("Test 4");

        Assert.assertFalse(unsharedFlyweight1 == unsharedFlyweight2);
    }

    @Test
    public void testDrawCycle(){
        Shape shape1 = ShapeFactory.getShape("红色");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("灰色");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("绿色");
        shape3.draw();

        Shape shape4 = ShapeFactory.getShape("红色");
        shape4.draw();

        Shape shape5 = ShapeFactory.getShape("灰色");
        shape5.draw();

        Shape shape6 = ShapeFactory.getShape("灰色");
        shape6.draw();

        Shape shape7 = ShapeFactory.getShape("黑色");


        System.out.println("一共绘制了"+ShapeFactory.getSum()+"种颜色的圆形");
    }
}
