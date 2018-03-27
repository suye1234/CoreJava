package org.suye.corejava.decorator;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.decorator.marvel.IronMan;
import org.suye.corejava.decorator.marvel.Person;
import org.suye.corejava.decorator.marvel.SpiderMan;

/**
 * Created by Administrator on 2016/12/12.
 */
public class MarvelTest {

    @Test
    public void testIronMan(){
        org.suye.corejava.decorator.marvel.Person tonyStark = new Person("Tony Stark", 45);

        IronMan ironMan = new IronMan(tonyStark);

        ironMan.run();
        ironMan.listen();
        ironMan.speak();
        ironMan.fly();

        Assert.assertTrue(true);
    }

    @Test
    public void testSuperMan(){
        SpiderMan perterParker = new SpiderMan("Peter Parker", 18);

        perterParker.run();
        perterParker.listen();
        perterParker.speak();
        perterParker.fly();

        Assert.assertTrue(true);
    }
}
