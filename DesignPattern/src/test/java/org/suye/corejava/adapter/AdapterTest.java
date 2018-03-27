package org.suye.corejava.adapter;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.adapter.shape.*;

/**
 * Created by suye on 2018/3/27.
 */
public class AdapterTest {

    @Test
    public void testClassAdapter(){
        IDrawCircle classAdapter = new DrawClassAdapter();

        classAdapter.drawCircle();

        Assert.assertTrue(true);
    }


    @Test
    public void testObjectAdapter(){
        IDrawCircle objectAdapter = new DrawObjectAdapter(new DrawRectangle());

        objectAdapter.drawCircle();

        Assert.assertTrue(true);
    }


    @Test
    public void testDefaultAdapter(){
        IDraw defaultAdapter = new DrawRectangle();

        defaultAdapter.drawRectangle();

        Assert.assertTrue(true);
    }

}
