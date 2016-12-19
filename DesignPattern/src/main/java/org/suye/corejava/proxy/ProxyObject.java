package org.suye.corejava.proxy;

import org.suye.corejava.proxy.service.AbstractObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suye on 2016/12/19.
 */
public class ProxyObject extends AbstractObject {
    private AbstractObject object;

    public ProxyObject(AbstractObject object) {
        this.object = object;
    }

    public void operate() {
        System.out.println("Do something before....");
        object.operate();
        System.out.println("Do something end......");
    }
}

