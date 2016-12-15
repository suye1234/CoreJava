package org.suye.corejava.prototype;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.prototype.monkey.Monkey;
import org.suye.corejava.prototype.monkey.TheGreatestSage;
import org.suye.corejava.prototype.register.ConcretePrototype3;
import org.suye.corejava.prototype.register.ConcretePrototype4;
import org.suye.corejava.prototype.register.PrototypeManager;
import org.suye.corejava.prototype.register.service.Prototype;
import org.suye.corejava.prototype.simple.ConcretePrototype1;
import org.suye.corejava.prototype.simple.SimpleClient;

import java.io.IOException;

/**
 * Created by Administrator on 2016/12/14.
 */
public class PrototypeTest {

    @Test
    public void testSimplePrototype(){
        SimpleClient client = new SimpleClient(new ConcretePrototype1());

        client.operate();

        Assert.assertTrue(true);
    }

    @Test
    public void testRegisterPrototype(){
        PrototypeManager prototypeManager = new PrototypeManager();

        prototypeManager.addPrototype("p1",new ConcretePrototype3());
        prototypeManager.addPrototype("p2",new ConcretePrototype4());

        Prototype p1  = prototypeManager.getPrototype("p1").clone();
        Prototype p2 = prototypeManager.getPrototype("p2").clone();

        Assert.assertEquals("ConcretePrototype3", p1.getName());
        Assert.assertEquals("ConcretePrototype4", p2.getName());
    }


    @Test
    public void testTheGreatestSageClone(){
        TheGreatestSage wukong = new TheGreatestSage(new Monkey());
        wukong.change();

        Assert.assertTrue(true);
    }

    @Test
    public void testTheGreatestSageCloneDeepClone() throws IOException, ClassNotFoundException {
        TheGreatestSage wukong = new TheGreatestSage(new Monkey());
        wukong.deepChange();

        Assert.assertTrue(true);
    }
}
