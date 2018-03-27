package org.suye.corejava.decorator.marvel;

import org.suye.corejava.decorator.marvel.service.IHumanBehavior;

/**
 * 默认适配模式，提供部分方法的默认实现，子类只需实现想要实现的方法即可.
 */
public class Human implements IHumanBehavior {
    protected Integer age;

    public void run(){

    }

    public void speak() {

    }

    public void listen() {

    }

    public Integer getAge() {
        return age;
    }

    public Human(Integer age) {
        this.age = age;
    }

}
