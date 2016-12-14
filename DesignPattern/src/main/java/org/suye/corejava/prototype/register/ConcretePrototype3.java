package org.suye.corejava.prototype.register;

import org.suye.corejava.prototype.register.service.Prototype;

/**
 * Created by Administrator on 2016/12/14.
 */
public class ConcretePrototype3 implements Prototype {
    private String name;

    public Prototype clone() {
        System.out.println("New ConcretePrototype3.......");

        ConcretePrototype3 instance =  new ConcretePrototype3();
        instance.setName("ConcretePrototype3");

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
