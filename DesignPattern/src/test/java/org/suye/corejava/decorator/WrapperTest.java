package org.suye.corejava.decorator;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.decorator.decorator.ConcreteComponent;
import org.suye.corejava.decorator.decorator.ConcreteDecorator1;
import org.suye.corejava.decorator.decorator.ConcreteDecorator2;
import org.suye.corejava.decorator.decorator.service.Component;
import org.suye.corejava.decorator.monkey.Bird;
import org.suye.corejava.decorator.monkey.Fish;
import org.suye.corejava.decorator.monkey.Monkey;
import org.suye.corejava.decorator.monkey.service.TheGreatestSage;
import org.suye.corejava.decorator.shape.Rectangle;
import org.suye.corejava.decorator.shape.RedBorderDecorator;
import org.suye.corejava.decorator.shape.Shape;
import org.suye.corejava.decorator.shape.YellowBackgroundDecorator;
import org.suye.corejava.decorator.window.Border;
import org.suye.corejava.decorator.window.HorizontalScrollBar;
import org.suye.corejava.decorator.window.VerticalScrollBar;
import org.suye.corejava.decorator.window.Window;
import org.suye.corejava.decorator.window.service.Lcd;

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
    public void testShape(){
        Shape rectangle = new Rectangle();

        rectangle.draw();

        rectangle = new RedBorderDecorator(rectangle);

        rectangle.draw();

        rectangle = new YellowBackgroundDecorator(rectangle);

        rectangle.draw();

        Assert.assertTrue(true);
    }

    @Test
    public void testMonkey(){
        TheGreatestSage sage = new Monkey();

        sage.move();

        TheGreatestSage bird = new Bird(sage);

        bird.move();

        ((Bird)bird).fly();

        TheGreatestSage fish = new Fish(bird);

        fish.move();

        ((Fish)fish).swim();

        Assert.assertTrue(true);
    }

    @Test
    public void testWindow(){
        Lcd window = new HorizontalScrollBar(new VerticalScrollBar(new Border(new Window())));

        window.draw();

        Assert.assertTrue(true);
    }
}
