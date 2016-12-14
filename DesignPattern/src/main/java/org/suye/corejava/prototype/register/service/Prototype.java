package org.suye.corejava.prototype.register.service;

/**
 * Created by Administrator on 2016/12/14.
 */
public interface Prototype {
    Prototype clone();

    String getName();

    void setName(String name);
}
