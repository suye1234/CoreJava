package org.suye.corejava.wrapper;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.wrapper.decorator.ConcreteComponent;
import org.suye.corejava.wrapper.decorator.ConcreteDecorator1;
import org.suye.corejava.wrapper.decorator.ConcreteDecorator2;
import org.suye.corejava.wrapper.decorator.Decorator;
import org.suye.corejava.wrapper.decorator.service.Component;
import org.suye.corejava.wrapper.monkey.Bird;
import org.suye.corejava.wrapper.monkey.Change;
import org.suye.corejava.wrapper.monkey.Fish;
import org.suye.corejava.wrapper.monkey.Monkey;
import org.suye.corejava.wrapper.monkey.service.TheGreatestSage;

/**
 * Created by Administrator on 2016/12/19.
 */
public class WrapperTest {
    @Test
    public void testDecorator(){
        Component component = new ConcreteComponent();

        component.operate();

        Component decorator1 = new ConcreteDecorator1(component);

        decorator1.operate();

        Component decorator2 = new ConcreteDecorator2(decorator1);

        decorator2.operate();

        Assert.assertTrue(true);
    }

    @Test
    public void testMonkey(){
        TheGreatestSage sage = new Monkey();

        sage.move();

        Bird bird = new Bird(sage);

        bird.move();

        bird.fly();

        Fish fish = new Fish(bird);

        fish.move();

        fish.swim();

        Assert.assertTrue(true);
    }
}
