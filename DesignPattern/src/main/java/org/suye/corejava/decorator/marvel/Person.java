package org.suye.corejava.decorator.marvel;

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
        System.out.println("Person: " + name + " is speaking");
    }

    @Override
    public void run() {
        System.out.println("Person: " + name + " is running");
    }

    @Override
    public void listen() {
        System.out.println("Person: " + name + " is listening");
    }

    public String getName() {
        return name;
    }
}
