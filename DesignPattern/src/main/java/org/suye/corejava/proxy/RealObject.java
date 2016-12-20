package org.suye.corejava.proxy;

import org.suye.corejava.proxy.service.AbstractObject;

/**
 * Created by suye on 2016/12/19.
 */
public class RealObject implements AbstractObject {
    public void operate() {
        System.out.println("Print RealObject.......");
    }
}
