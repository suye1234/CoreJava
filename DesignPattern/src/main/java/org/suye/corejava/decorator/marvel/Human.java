package org.suye.corejava.decorator.marvel;

import org.suye.corejava.decorator.marvel.service.IHumanBehavior;

/**
 * 默认适配模式，提供部分方法的默认实现，子类只需实现想要实现的方法即可.
 */
public class Human implements IHumanBehavior {
    private Integer age;

    public void run(){
        System.out.println("I'm running");
    }

    public void speak() {
        System.out.println("Do nothing....");
    }

    public void listen() {
        System.out.println("I'm listening");
    }

    public Integer getAge() {
        return age;
    }

    public Human(Integer age) {
        this.age = age;
    }

}
