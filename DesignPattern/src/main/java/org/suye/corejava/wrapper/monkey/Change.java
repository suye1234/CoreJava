package org.suye.corejava.wrapper.monkey;

import org.suye.corejava.wrapper.monkey.service.TheGreatestSage;

/**
 * Created by Administrator on 2016/12/19.
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        sage.move();
    }
}
