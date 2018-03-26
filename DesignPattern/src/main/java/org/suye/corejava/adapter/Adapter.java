package org.suye.corejava.adapter;

import org.suye.corejava.adapter.service.Target;

/**
 * Created by suye on 2018/3/26.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void operation1() {
        adaptee.operation1();
    }

    @Override
    public void operation2() {
        System.out.printf("Operation2.......");
    }
}
