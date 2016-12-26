package org.suye.corejava.proxy;

import org.suye.corejava.flyweight.shape.service.Shape;
import org.suye.corejava.proxy.service.AbstractObject;

/**
 * Created by suye on 2016/12/19.
 */
public class ProxyObject implements AbstractObject {
    private AbstractObject wrapee;

    public ProxyObject(AbstractObject wrapee) {
        this.wrapee = wrapee;
    }

    public void operate() {
        System.out.println("Do something before....");
        wrapee.operate();
        System.out.println("Do something end......");
    }
}

