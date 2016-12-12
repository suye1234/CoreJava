package org.suye.corejava.adapter;

import org.suye.corejava.adapter.service.ISuperManBehavior;

/**
 * 对象适配器模式，包装了被适配类的实例，实现目标方法。
 */
public class IronMan implements ISuperManBehavior{
    private Person person;

    public IronMan(Person person) {
        this.person = person;
    }

    public void fly() {
        System.out.println(person.getName() + " is flying");
    }

    public void run() {
        person.run();
    }

    public void speak() {
        person.speak();
    }

    public void listen() {
        person.listen();
    }
}
