package org.suye.corejava.wrapper.monkey;

import org.suye.corejava.wrapper.monkey.service.TheGreatestSage;

/**
 * Created by Administrator on 2016/12/19.
 */
public class Monkey implements TheGreatestSage{
    @Override
    public void move() {
        System.out.println("Monkey is moving.....");
    }
}
