package org.suye.corejava.wrapper.monkey;

import org.suye.corejava.wrapper.monkey.service.TheGreatestSage;

/**
 * Created by Administrator on 2016/12/19.
 */
public class Fish extends Change {
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    public void swim(){
        System.out.println("Fish is swimming.....");
    }

    @Override
    public void move() {
        super.move();

        System.out.println("Fish is moving........");
    }
}
