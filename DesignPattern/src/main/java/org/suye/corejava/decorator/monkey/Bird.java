package org.suye.corejava.decorator.monkey;

import org.suye.corejava.decorator.monkey.service.TheGreatestSage;

/**
 * Created by Administrator on 2016/12/19.
 */
public class Bird extends  Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    public void fly(){

        System.out.println("Bird is flying....");
    }

    @Override
    public void move() {
        super.move();

        System.out.println("Bird is moving.......");
    }
}
