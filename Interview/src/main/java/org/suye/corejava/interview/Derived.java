package org.suye.corejava.interview;

/**
 * Created by suye on 2017/2/15.
 */
public class Derived extends Base {
    private String name = "derived";

    public Derived() {
        tellName();
        printName();
    }

    public void tellName() {
        System.out.println("Derived tell name: " + name);
    }

    public void printName() {
        System.out.println("Derived print name: " + name);
    }

    public static void main(String[] args){

        new Derived();
    }
}

class Base {
    private String name = "base";

    public Base() {
        tellName();
        printName();
    }

    public void tellName() {
        System.out.println("Base tell name: " + name);
    }

    public void printName() {
        System.out.println("Base print name: " + name);
    }
}