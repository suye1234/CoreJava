package org.suye.corejava.decorator;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.decorator.marvel.IronDecorator;
import org.suye.corejava.decorator.marvel.Person;
import org.suye.corejava.decorator.marvel.SpiderDecorator;
import org.suye.corejava.decorator.marvel.service.IHumanBehavior;

/**
 * Created by Administrator on 2016/12/12.
 */
public class MarvelTest {

    @Test
    public void testIronMan(){
        IHumanBehavior tonyStark = new Person("Tony Stark", 45);

        tonyStark = new IronDecorator(tonyStark);

        tonyStark.run();
        tonyStark.listen();
        tonyStark.speak();
        ((IronDecorator)tonyStark).fly();

        Assert.assertTrue(true);
    }

    @Test
    public void testSuperMan(){
        IHumanBehavior perterParker = new Person("Peter Parker", 18);

        perterParker = new SpiderDecorator(perterParker);

        perterParker.run();
        perterParker.listen();
        perterParker.speak();
        ((SpiderDecorator)perterParker).climb();

        Assert.assertTrue(true);
    }
}
