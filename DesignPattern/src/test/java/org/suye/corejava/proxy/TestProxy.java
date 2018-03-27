package org.suye.corejava.proxy;

import org.junit.Assert;
import org.junit.Test;
import org.suye.corejava.proxy.service.AbstractObject;

/**
 * Created by suye on 2016/12/20.
 */
public class TestProxy {

    @Test
    public void testProxy() {
        AbstractObject realObject = new RealObject();

        AbstractObject proxyObj = new ProxyObject(realObject);

        proxyObj.operate();

        Assert.assertTrue(true);
    }
}
