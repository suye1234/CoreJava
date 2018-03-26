package org.suye.corejava.adapter;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.adapter.service.Target;

/**
 * Created by suye on 2018/3/26.
 */
public class AdapterTest {
    @Test
    public void testAdapter(){
        Adaptee adaptee = new Adaptee();

        Target target = new Adapter(adaptee);

        target.operation1();
        target.operation2();

        Assert.assertTrue(true);
    }

}
