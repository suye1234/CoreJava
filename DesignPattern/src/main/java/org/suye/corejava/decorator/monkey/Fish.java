package org.suye.corejava.decorator.monkey;

import org.suye.corejava.decorator.monkey.service.TheGreatestSage;

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
