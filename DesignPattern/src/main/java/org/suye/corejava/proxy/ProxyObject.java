package org.suye.corejava.proxy;

import org.suye.corejava.flyweight.shape.service.Shape;
import org.suye.corejava.proxy.service.AbstractObject;

/**
 * Created by suye on 2016/12/19.
 */
public class ProxyObject implements AbstractObject {
    private AbstractObject realObject;

    public ProxyObject(AbstractObject realObject) {
        this.realObject = realObject;
    }

    public void operate() {
        System.out.println("Do something before....");
        realObject.operate();
        System.out.println("Do something end......");
    }
}

