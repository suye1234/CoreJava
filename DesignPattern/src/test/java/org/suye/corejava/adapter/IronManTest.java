package org.suye.corejava.adapter;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2016/12/12.
 */
public class IronManTest {

    @Test
    public void testIronMan(){
        Person tonyStark = new Person("Tony Stark", 45);

        IronMan ironMan = new IronMan(tonyStark);

        ironMan.run();
        ironMan.listen();
        ironMan.speak();
        ironMan.fly();

        Assert.assertTrue(true);
    }

    @Test
    public void testSuperMan(){
        SuperMan clarkKent = new SuperMan("Clark Kent", 999);

        clarkKent.run();
        clarkKent.listen();
        clarkKent.speak();
        clarkKent.fly();

        Assert.assertTrue(true);
    }
}
