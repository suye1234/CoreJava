package org.suye.corejava.adapter;

import org.suye.corejava.adapter.service.IHumanBehavior;

/**
 * Created by Administrator on 2016/12/12.
 */
public class Person extends Human{
    public Person(String name, Integer age) {
        super(age);
        this.name = name;
    }

    private String name;

    @Override
    public void speak() {
        System.out.println(name + " is speaking");
    }

    public String getName() {
        return name;
    }


}
