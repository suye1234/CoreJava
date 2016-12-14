package org.suye.corejava.prototype.register;

import org.suye.corejava.prototype.register.service.Prototype;

/**
 * Created by Administrator on 2016/12/14.
 */
public class ConcretePrototype4 implements Prototype {
    private String name;

    public Prototype clone() {
        System.out.println("New ConcretePrototype4......");

        ConcretePrototype4 instance =  new ConcretePrototype4();
        instance.setName("ConcretePrototype4");

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
